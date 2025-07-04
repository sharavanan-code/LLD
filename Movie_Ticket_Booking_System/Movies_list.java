package Movie_Ticket_Booking_System;

import java.util.Objects;

public class Movies_list {

    private String name;
    private String show_time;

    public Movies_list(String name, String show_time){
        this.name =name;
        this.show_time =show_time;
    }

    public String getName(){
        return name;
    }

    public String getShowtime(){
        return show_time;
    }
    
    @Override
public boolean equals(Object o) {
    if (this == o) return true; // if it's the exact same object
    if (!(o instanceof Movies_list)) return false; // if the other object isn't a Movies_list, it's not equal
    Movies_list that = (Movies_list) o;

    // Compare movie name and show time, ignoring case
    return name.equalsIgnoreCase(that.name) && show_time.equalsIgnoreCase(that.show_time);
}

@Override
public int hashCode() {
    // Generate a hash from the lowercase name and show_time
    return Objects.hash(name.toLowerCase(), show_time.toLowerCase());
}



    
}
