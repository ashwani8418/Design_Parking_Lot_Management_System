package org.example.lot.Models;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@SuperBuilder
@Getter
public class Floor extends BaseModel{

    private Integer floorNumber;
    private List<Slot> slots = new ArrayList<> ();
    private DisplayBoard displayBoard;
    private PaymentCounter paymentCounter;
}
