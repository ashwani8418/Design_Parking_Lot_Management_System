package org.example.lot.services;

import org.example.lot.Models.Slot;
import org.example.lot.Models.SlotStatus;
import org.example.lot.Models.Ticket;
import org.example.lot.Models.Vehicle;
import org.example.lot.dtos.CreateTicketRequest;
import org.example.lot.exceptions.SlotNotAvailableException;
import org.example.lot.repositories.TicketRepository;

public class TicketService {

    private SlotService slotService;
    private VehicleService vehicleService;
    private TicketRepository ticketRepository;
    public Ticket createTicket(CreateTicketRequest request){
//        If a slot is available -> Business validation
//        If not available, throw an error
        Slot slot = slotService.allocateSlot(request.getVehicleType ());
        if(slot == null){
            throw new SlotNotAvailableException ();
        }
//        if slot available, mark the slot occupied and save it
        slot.setStatus (SlotStatus.OCCUPIED);
        slotService.save(slot);

//        If the vehicle is new, create a new Object
//        If the vehicle has come to us before, use the existing one
        Vehicle vehicle = vehicleService.findOrCreate (request.getVehicleNumber (), request.getVehicleType () )
//        Create the ticket
        Ticket ticket = Ticket
                .builder ()
                .entryTime (request.getEntryTime())
                .slot (slot)
                .vehicle (vehicle)
                .build ();
        return  ticketRepository.save(ticket);
    }
}
