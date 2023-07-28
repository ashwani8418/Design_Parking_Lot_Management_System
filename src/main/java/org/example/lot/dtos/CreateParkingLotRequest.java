package org.example.lot.dtos;

import lombok.Getter;
import org.example.lot.Models.*;
import org.example.lot.genrators.FloorId;
import org.example.lot.genrators.SlotId;

import java.util.Collections;
import java.util.List;

@Getter
public class CreateParkingLotRequest {
    private Long id;
    private String name;
    private String address;
    private Integer numberOfFloors;
    private Integer numberOfSlotsPerFloor;
    private Integer numberOfGates;

//    Create a list of parking Slots -> numberOfSlotsPerFloor
//    Create a list of floors using slots -> numberOfFloors

    public ParkingLot toParkingLot() {
        // Create dummy parking spots and update their ids
        List<Slot> parkingSpots = Collections.nCopies(numberOfSlotsPerFloor, Slot.mediumAvailable());
        parkingSpots.forEach(parkingSpot -> parkingSpot.setId(SlotId.nextId()));

        // Create dummy parking floors and update their ids
        List<Floor> parkingFloors = Collections.nCopies(numberOfFloors,
                Floor
                        .builder()
                        .slots (parkingSpots)
                        .paymentCounter(PaymentCounter.builder().build())
                        .build());
        parkingFloors.forEach(parkingFloor -> parkingFloor.setId(FloorId.nextId()));

        return ParkingLot
                .builder()
                .id(id)
                .name(name)
                .address(address)
                .floors(parkingFloors)
                .entryGates(Collections.nCopies(numberOfFloors, Gate.builder().build()))
                .exitGates(Collections.nCopies(numberOfFloors, Gate.builder().build()))
                .build();

    }
}
