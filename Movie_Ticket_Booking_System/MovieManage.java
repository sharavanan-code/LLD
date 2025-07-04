package Movie_Ticket_Booking_System;

import java.util.HashMap;

public class MovieManage {
    private HashMap<Movies_list, Integer> map = new HashMap<>();
    private int seats = 100;


    public void addshow(String movie_name, String show_time) {
        Movies_list movie = new Movies_list(movie_name, show_time);
        map.put(movie, seats);

    }

    public void display(){
        if(map.isEmpty()){
            System.out.println("there is no show");
        }

      for(Movies_list movie : map.keySet()){
        System.out.println("Movie Name "+movie.getName()+" show time "+movie.getShowtime());
      }

    
     
    }

    public void bookticket(String movie, String show,int n) {
        Movies_list key = new Movies_list(movie, show);
        if(!map.containsKey(key)){
            System.out.println("no such a show found");
            return;
        }

        int availableseats = map.get(key);

        if(n > availableseats){
            System.out.println("only few seats available"+availableseats);
        }else{
            map.put(key, availableseats-n);
            System.out.println("ticket successfully booked");
        }
        
    }




    
}
