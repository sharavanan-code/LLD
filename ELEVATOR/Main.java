package ELEVATOR;

import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ElevatorController controller = new ElevatorController(4);
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Welcome to the lift services");
            System.out.println("NO.1 for lift access");
            System.out.println("NO.2 for exit");


            int x =input.nextInt();

            switch(x){
                case 1 ->{
                    System.out.println("enter your current floor NO 0-10");
                    int n = input.nextInt();
                    System.out.println("enter your drop floor No 0-10");
                    int z = input.nextInt();

                    Elevator elevator = controller.assignElevator(n);
                    elevator.requestFloor(n);
                    elevator.requestFloor(z);

                    System.out.println("assigned "+elevator.getId());

                    for (int i = 0; i < 10; i++) {
                    System.out.println("Step " + (i + 1) + ":");
                    controller.printsteps();
                    Thread.sleep(500); 
}

                }
                case 2 ->{
                    System.out.println("EXIT....");
                }

                default -> System.out.println("you enter the INvalid Number enter(1 or 2)");

            }

           

        }
    }
    
}
