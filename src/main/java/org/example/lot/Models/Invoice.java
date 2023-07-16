package org.example.lot.Models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Invoice extends BaseModel {
    private Ticket ticket;
    private LocalDateTime exitTime;
    private Double amount;

    private List<Payment> payments = new ArrayList<> ();
}
