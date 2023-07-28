package org.example.lot.controller;

import lombok.AllArgsConstructor;
import org.example.lot.Models.ParkingLot;
import org.example.lot.dtos.CreateParkingLotRequest;
import org.example.lot.exceptions.InvalidParkingLotRequest;
import org.example.lot.services.ParkingLotService;

//Request Layer - Accept the request layer from clients and passes it to the service layer
// Tow small responsibilities
// 1. Request level validation -> Only for the request; not business logic

@AllArgsConstructor
public class ParkingLotController {

    private ParkingLotService parkingLotService;
    //    Read a parking lot -> GET /parking-lot/:id
    public ParkingLot getParkingLot(Long id){
        validateId (id);
        return parkingLotService.getParkingLot (id);
    }

    private static void validateId(Long id) {
        if(id == null){
//            Client Error - 400 - Bad request
            throw new InvalidParkingLotRequest ();
        }
    }

    //    Create a parking lot -> POST /parking-lot/
//    DTO - Request body - Data transfer object
    public ParkingLot createParkingLot(CreateParkingLotRequest request){
        validateRequest(request);
        return parkingLotService.createParking (request.toParkingLot());
    }

    private void validateRequest(CreateParkingLotRequest request){
        if(request.getNumberOfFloors () == null || request.getNumberOfSlotsPerFloor () == null){
            throw new InvalidParkingLotRequest ();
        }
    }

}

//    Method in parking lot controller
//    Resource - Parking lot
//    CRUD
//    /resource/:resource-id
//    Read a parking lot -> GET /parking-lot/:id
//    Create a parking lot -> POST /parking-lot/
//    Update a parking lot -> PUT /parking-lot/:id vs PATCH -> Partial update
//    Delete a parking lot -> DELETE /parking-lot/:id