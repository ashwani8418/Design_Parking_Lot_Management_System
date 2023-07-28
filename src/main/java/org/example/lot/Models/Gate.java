package org.example.lot.Models;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Gate extends BaseModel {
    private Integer gateNumber;
    private GateType gateType;
    private Operator operator;
    private PaymentCounter paymentCounter;
    private DisplayBoard displayBoard;
}
