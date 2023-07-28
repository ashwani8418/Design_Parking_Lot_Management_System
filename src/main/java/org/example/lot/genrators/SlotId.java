package org.example.lot.genrators;

import java.util.concurrent.atomic.AtomicLong;

public class SlotId {
//    Generate a sequence long for us

    private static AtomicLong idCounter = new AtomicLong ();
    public static Long nextId(){
        return idCounter.getAndIncrement ();
    }
}
