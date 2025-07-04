package Railway_booking_system.models;

import java.util.*;


public class Train {
  
    private String route;
    private Map<SeatType, Integer> availableSeats;
    private int trainNumber;

    public Train(int trainNumber, String route, int lower, int middle , int upper){
        this.trainNumber = trainNumber;
        this.route = route;
        this.availableSeats = new EnumMap<>(SeatType.class);
        this.availableSeats.put(SeatType.LOWER, lower);
        this.availableSeats.put(SeatType.MIDDLE, middle);
        this.availableSeats.put(SeatType.UPPER, upper);
        
    }

    public int getTrainNumber(){
        return trainNumber;
    }

    public String getRoute() {
        return route;
    }

    public boolean bookseat(SeatType seatType){
        int count = availableSeats.get(seatType);
        if(count > 0){
            availableSeats.put(seatType, count-1);
            return true;
        }
        else{
            return false;
        }
    }

    public void displayAvailability(){
        System.out.println("Train number "+trainNumber+" "+route);
        for(Map.Entry<SeatType, Integer> entry : availableSeats.entrySet()){
            System.out.println(entry.getKey()+"values are present here "+entry.getValue());

        }
    }



    
}
