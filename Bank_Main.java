import java.util.Scanner;

public class Bank_Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance =0;

     while(true){
           
        System.out.println("enter No.1 for deposite");
        System.out.println("enter No.2 for withdraw");
        System.out.println("enter No.3 for check_balance");
        System.out.println("enter No.4 for exit");
        int z = input.nextInt();


        switch (z) {
            case 1 -> {
                System.out.println("you selecting the deposite");
                System.out.println("enter the amount you want to deposite");
                int amount = input.nextInt();
                balance  =deposite(balance, amount);

            }

            case 2 -> {
                System.out.println("you selecting the withdraw");
                System.out.println("enter the amount you want to withdraw");
                int amount = input.nextInt();
                balance = withdraw(balance, amount);

            }

            case 3->{
                System.out.println("you selecting the balance enqurey");
                check(balance);

            }
            case 4 ->{
                System.out.println("thank you visit again thank you so much");
                return;
            }
                
                
        
             default -> System.out.println("Invalid choice. Please enter a number from 1 to 4.");
        }
     }

       

        
    }

    public static int deposite(int balance, int amount){
       balance+=amount;
       System.out.println("you money "+amount+" "+ "is deposited");
       return balance;

    }

    public static int withdraw(int balance, int amount){
       if(balance < amount){
        System.out.println("sorry your withdarwal amount was insufficient "+balance);
       }
       else{
        System.out.println("wthdrawal successfully "+ amount);
        balance-=amount;
       }

       return balance;
    }

    public static void check(int balance){
         System.out.println("Your current balance is ₹" + balance);
    }


}