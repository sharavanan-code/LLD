package PARKING_LOT;

public class Vehicle {

   private String vechileNumber;
   private  VehicleType type;

   public Vehicle(String vechileNumber, VehicleType type){
    this.vechileNumber = vechileNumber;
    this.type = type;
   }

   public String getVechileNumber(){
    return vechileNumber;
   }

   public VehicleType getType(){
    return type;
   }

    
}
