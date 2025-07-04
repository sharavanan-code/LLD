package ELEVATOR;

import java.util.*;


public class Elevator {
    private int id;
    private int currentFloor = 0;
    private Directions direction = Directions.SAME;
    private Queue<Integer> request = new LinkedList<>();

    public Elevator(int id){
        this.id =id;
    }

    public int getId(){
        return id;
    }

    public int getcurrentfloor(){
        return currentFloor;

    }

    public void requestFloor(int floor){
        if(!request.contains(floor)){
            request.offer(floor);
            updateDirection(floor);
        }
    }

    public void move(){
        if(request.isEmpty()){
            direction =Directions.SAME;
            return;
        }

        int target = request.peek();

        if(currentFloor < target){
            currentFloor++;
            direction = Directions.UP;

        }else if(currentFloor > target){
            currentFloor--;
            direction = Directions.DOWN;
        }
        else {
            System.out.println("Elevator"+id+"reached floor"+target);
            request.poll();

        }if (request.isEmpty()) {
            direction = Directions.SAME;
        }
        
    }

    private void updateDirection(int target){
        if(currentFloor < target)  direction = Directions.UP;
        if(currentFloor > target)  direction = Directions.DOWN;
        if(currentFloor == target) direction = Directions.SAME;
    }

    public void printStatus() {
        System.out.println("Elevator " + id + " | Floor: " + currentFloor + " | Direction: " + direction + " | Queue: " + request);
    }
   
    
}
