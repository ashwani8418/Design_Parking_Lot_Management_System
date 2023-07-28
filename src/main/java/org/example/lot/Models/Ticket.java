package org.example.lot.Models;

import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@SuperBuilder
public class Ticket extends BaseModel{
    private Vehicle vehicle;
    private LocalDateTime entryTime;
    private Slot slot;
}
