package Movie_Ticket_Booking_System;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        MovieManage theater = new MovieManage();
        

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("please enter your choice");
            System.out.println("1.Add movies and showtimes");
            System.out.println("2.View available shows");
            System.out.println("3.Book ticket");
            System.out.println("4.Exit");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1->{
                    System.out.println("you enter the add movies and showtimes");
                    System.out.println("enter the movie name you like to add");
                    String movie_name = input.next().toUpperCase();

                    System.out.println("enter the show time");
                    String show_time = input.next().toUpperCase();

                    theater.addshow(movie_name, show_time);


                }
                case 2->{
                    theater.display();
                }

                case 3->{
                    System.out.println("enter the movie name");
                    String name = input.next().toUpperCase();

                    System.out.println("enter the show time");
                    String show = input.next().toUpperCase();

                    System.out.println("enter the number of tickets less than 5");
                    int n = input.nextInt();
                    if(n <=5 ){
                        theater.bookticket(name, show, n);
                    }else{
                        System.out.println("so sorry everyone wants to see the film");
                    }
                }

                case 4->{
                    System.out.println("thank you for visting come again");
                    return;

                }
                default -> System.out.println("you enter the wrong choice");
               
            }
        }
    }
    
}
