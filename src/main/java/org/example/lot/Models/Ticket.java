package org.example.lot.Models;

import java.time.LocalDateTime;

public class Ticket extends BaseModel{
    private Vehicle vehicle;
    private LocalDateTime entryTime;
    private Slot slot;
}
