package org.example.lot.exceptions;

public class InvalidParkingLotRequest extends RuntimeException{
    public InvalidParkingLotRequest() {
        super("ID is required");
    }
}
