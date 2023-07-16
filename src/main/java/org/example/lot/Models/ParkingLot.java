package org.example.lot.Models;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ParkingLot extends BaseModel{

    private String name;
    private String address;
    private List<Floor> floors = new ArrayList<> ();
    private List<Gate> entryGates = new ArrayList<> ();
    private List<Gate> exitGates = new ArrayList<> ();
}
