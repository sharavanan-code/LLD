package PARKING_LOT;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {

private final Map<String, Vehicle> ParkingMap = new HashMap<>();

public boolean parkVehicle(Vehicle vehicle){
    if(ParkingMap.containsKey(vehicle.getVechileNumber())){
        System.out.println("Vehicle is already parked here");
        return false;

    }
      ParkingMap.put(vehicle.getVechileNumber(), vehicle);
        return true;
}

public boolean removeVehicle(String vehicleNumber){
    if(!ParkingMap.containsKey(vehicleNumber)){
        System.out.println("there is no parked vehicle here");
        return false;
        
    }
    ParkingMap.remove(vehicleNumber);
    return true;
}
    
}
