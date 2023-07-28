package org.example.lot.Models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@SuperBuilder
public class ParkingFloor extends BaseModel{
    private Integer floorNumber;
    private String name;
    private List<ParkingSpot> parkingSpots = new ArrayList<> ();
    private PaymentCounter paymentCounter;
}
