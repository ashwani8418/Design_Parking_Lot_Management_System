package org.example;

import org.example.lot.Models.ParkingLot;
import org.example.lot.controller.ParkingLotController;
import org.example.lot.services.ParkingLotService;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private static ParkingLotService parkingLotService = new ParkingLotService ();
    private static ParkingLotController parkingLotController = new ParkingLotController (parkingLotService);
    public static void main(String[] args) {

        parkingLotController.getParkingLot (1L);
    }
}