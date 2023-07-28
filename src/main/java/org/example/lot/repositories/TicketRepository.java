package org.example.lot.repositories;

import org.example.lot.Models.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketRepository {
    private List<Ticket> tickets = new ArrayList<> ();

    private Ticket save(Ticket ticket){
        tickets.add (ticket);
        return ticket;
    }
}
