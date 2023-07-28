package org.example.lot.Models;

import jdk.jshell.Snippet;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Getter
@SuperBuilder
public class ParkingLot extends BaseModel{

    private String name;
    private String address;
    private List<Floor> floors = new ArrayList<> ();
    private List<Gate> entryGates = new ArrayList<> ();
    private List<Gate> exitGates = new ArrayList<> ();
}
