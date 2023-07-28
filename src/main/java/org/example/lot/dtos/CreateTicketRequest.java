package org.example.lot.dtos;

import lombok.Getter;
import org.example.lot.Models.VehicleType;

import java.util.Date;

@Getter
public class CreateTicketRequest {
    private String vehicleNumber;
    private VehicleType vehicleType;
    private Date entryTime;
}
