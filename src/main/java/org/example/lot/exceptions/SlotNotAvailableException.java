package org.example.lot.exceptions;

public class SlotNotAvailableException extends RuntimeException {
    public SlotNotAvailableException(){
        super("Slot not found!");
    }
}
