package org.example.lot.services;

import lombok.AllArgsConstructor;
import org.example.lot.Models.Floor;
import org.example.lot.Models.ParkingLot;
import org.example.lot.repositories.ParkingLotRepository;
import org.example.lot.repositories.SlotRepository;

@AllArgsConstructor
public class ParkingLotService {

    private ParkingLotRepository parkingLotRepository;
    private SlotService slotService;
    public ParkingLot getParkingLot(Long id){
        System.out.println ("Getting parking lot with id : " + id);
        return parkingLotRepository.findById (id);
    }

    public ParkingLot createParking(ParkingLot parkingLot){
        ParkingLot savedLot = parkingLotRepository.save(parkingLot);
//        Then save the floor
//        Then save the slot

//        for(Floor floor : parkingLot.getFloors ()){
//            slotService.createParkingSlots (floor.getSlots ());
//        }
//        for loop converted to below
        savedLot.getFloors ().forEach (floor -> {
            slotService.createParkingSlots (floor.getSlots ());
        });
        return savedLot;
    }
}
