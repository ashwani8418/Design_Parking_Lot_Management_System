package org.example.lot.genrators;

import java.util.concurrent.atomic.AtomicLong;

public class FloorId {

    private static AtomicLong idCounter = new AtomicLong ();
    public static Long nextId(){
        return idCounter.getAndIncrement ();
    }
}
