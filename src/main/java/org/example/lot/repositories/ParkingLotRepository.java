package org.example.lot.repositories;

import org.example.lot.Models.ParkingLot;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ParkingLotRepository  {

    private List<ParkingLot> parkingLots = new ArrayList<> ();

    public ParkingLot findById(Long id){
//        for(ParkingLot parkingLot : parkingLots){
//            if(Objects.equals (parkingLot.getId (), id)){
//                return parkingLot;
//            }
//        }
//        return null;

//        Update version of the above method
        return parkingLots
                .stream ()
                .filter (parkingLot -> Objects.equals (parkingLot.getId (), id))
                .findFirst ()
                .orElse (null);
    }

    public ParkingLot save(ParkingLot parkingLot) {
        parkingLots.add (parkingLot);
        return parkingLot;
    }
}
