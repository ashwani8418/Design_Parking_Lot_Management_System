package org.example.lot.Models;

import java.util.ArrayList;
import java.util.List;

public class Floor extends BaseModel{

    private Integer floorNumber;
    private List<Slot> slots = new ArrayList<> ();
    private DisplayBoard displayBoard;
    private PaymentCounter paymentCounter;
}
