package PARKING_LOT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ParkingLot lot = new ParkingLot();

        while (true) {

            System.out.println("\nEnter your choice:");
            System.out.println("1. Parking Entry");
            System.out.println("2. Parking Exit");
            System.out.println("3. Exit System");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                // case 1 -> {

                //     VehicleType type = getVehicleType(input);
                //     System.out.println("Enter the vechile number");
                //     String VechileNo = input.next();

                //     int charge = switch(type){
                //         case CYCLE -> 5;
                //         case BIKE -> 10;
                //         case CAR -> 20;
                //         case HEAVY -> 30;

                //     };

                    
                //     System.out.println("Parking charge for " + type + " is ₹" + charge);
                //     System.out.print("Do you want to continue? (yes/no): ");
                //     String confirm = input.nextLine().trim().toLowerCase();

                //     if(confirm.equals("yes")){

                //     Vehicle vehicle = new Vehicle(VechileNo, type);

                //     if(lot.parkVehicle(vehicle)){
                //         System.out.println("parked successfully");
                //     }
                // }else{
                //     System.out.println("parking cancel");
                // }

                // }

                case 1 -> {
                    VehicleType type = getVehicleType(input);
                    System.out.print("Enter the vehicle number: ");
                    String vehicleNo = input.nextLine();  // ✅ fixed

                    int charge = switch (type) {
                        case CYCLE -> 5;
                        case BIKE -> 10;
                        case CAR -> 20;
                        case HEAVY -> 30;
                    };

                    System.out.println("Parking charge for " + type + " is ₹" + charge);
                    System.out.print("Do you want to continue? (yes/no): ");
                    String confirm = input.nextLine().trim().toLowerCase();

                    if (confirm.equals("yes")) {
                        Vehicle vehicle = new Vehicle(vehicleNo, type);
                        if (lot.parkVehicle(vehicle)) {
                            System.out.println("✅ Parked successfully.");
                        }
                    } else {
                        System.out.println("❌ Parking cancelled.");
                    }
                }

                 case 2 -> {
                    System.out.print("Enter vehicle number to exit: ");
                    String vehicleNo = input.nextLine();

                    if (lot.removeVehicle(vehicleNo)) {
                        System.out.println("🚗 Vehicle exited successfully.");
                    }
                }

                case 3 -> {
                    System.out.println("Exiting system...");
                    return;
                }

                default -> System.out.println("❌ Invalid option. Try again.");


                
               
            }
            
        }

     

        
    }

       private static VehicleType getVehicleType(Scanner input) {
        System.out.println("Select vehicle type:");
        System.out.println("1. Cycle");
        System.out.println("2. Bike");
        System.out.println("3. Car");
        System.out.println("4. Heavy Vehicle");

        int type = input.nextInt();
        input.nextLine(); // clear newline

        return switch (type) {
            case 1 -> VehicleType.CYCLE;
            case 2 -> VehicleType.BIKE;
            case 3 -> VehicleType.CAR;
            case 4 -> VehicleType.HEAVY;
            default -> throw new IllegalArgumentException("Invalid vehicle type");
        };
    
}
}