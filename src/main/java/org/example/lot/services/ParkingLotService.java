package org.example.lot.services;

import org.example.lot.Models.ParkingLot;
import org.example.lot.repositories.ParkingLotRepository;

public class ParkingLotService {

    private ParkingLotRepository parkingLotRepository;
    public ParkingLot getParkingLot(Long id){
        System.out.println ("Getting parking lot with id : " + id);
        return parkingLotRepository.findById (id);
    }
}
