package org.example.lot.Models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
public class Slot extends BaseModel {
    private Integer slotNumber;

    private VehicleType vehicleType;
    private SlotStatus status;
    public static Slot mediumAvailable(){
        return Slot.builder ()
                .vehicleType(VehicleType.MEDIUM)
                .status(SlotStatus.FREE)
                .build ();
    }
}
