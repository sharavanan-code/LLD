package ELEVATOR;


import java.util.*;

public class ElevatorController {
    private List<Elevator> elevtors;

    public ElevatorController(int count){
        elevtors = new ArrayList<>();
        for(int i = 1; i<=count; i++){
            elevtors.add(new Elevator(i));
        }

    }

    public Elevator assignElevator(int currentFloor){
        Elevator best = elevtors.get(0);
        int minDis = Math.abs(best.getcurrentfloor() - currentFloor);

        for(Elevator e : elevtors){
            int dis = Math.abs(e.getcurrentfloor() - currentFloor);
            if(minDis > dis){
                best =e;
                minDis =dis;
            }

            
        }
        return best;
    }
    

    public void printsteps(){
        for(Elevator e :elevtors){
            e.move();
            e.printStatus();
        }
    }

    public void stepAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stepAll'");
    }
}
