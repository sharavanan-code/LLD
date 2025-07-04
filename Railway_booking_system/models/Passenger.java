package Railway_booking_system.models;

public class Passenger {

    private String name;
    private int age;
    private Gender gender;

    public Passenger(String name, int age, Gender gender){
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    public String getName() {
    return name;
}

public int getAge() {
    return age;
}

public Gender getGender() {
    return gender;
}


    
}
