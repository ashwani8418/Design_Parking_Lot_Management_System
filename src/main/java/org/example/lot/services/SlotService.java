package org.example.lot.services;

import org.example.lot.Models.Slot;
import org.example.lot.Models.VehicleType;
import org.example.lot.repositories.ParkingLotRepository;
import org.example.lot.repositories.SlotRepository;

import java.util.List;

public class SlotService {
    private SlotRepository slotRepository;
    public void createParkingSlots(List<Slot> slots){

    }

    public Slot allocateSlot(VehicleType vehicleType) {
        return slotRepository.findOneByVehicleTypeAndStatsAvailable(vehicleType);
    }

    public void save(Slot slot) {
        slotRepository.save(slot);
    }
}

