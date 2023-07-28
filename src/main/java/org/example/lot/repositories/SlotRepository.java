package org.example.lot.repositories;

import org.example.lot.Models.Slot;
import org.example.lot.Models.SlotStatus;
import org.example.lot.Models.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class SlotRepository {
    private List<Slot> slots = new ArrayList<> ();
    public void saveAll(List<Slot> slots){

    }

    public Slot findOneByVehicleTypeAndStatsAvailable(VehicleType vehicleType) {
        for(Slot slot : slots){
            if(slot.getVehicleType () == vehicleType && slot.getStatus () == SlotStatus.FREE){
                return  slot;
            }
        }
        return null;
    }

    public void save(Slot slot) {
        slots.add(slot);
    }
}
