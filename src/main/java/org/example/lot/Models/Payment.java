package org.example.lot.Models;

public class Payment extends BaseModel{
    private PaymentType paymentType;
    private PaymentStatus paymentStatus;

    private Double amount;
    private Ticket ticket;
}
