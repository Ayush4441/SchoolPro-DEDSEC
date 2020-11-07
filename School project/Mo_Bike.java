/*
 * 5. Define a class mobike as described below:-
 * Data Members:-bno, phno, name, days, charge
 * Member Methods:-
 * void input()-To accept the details of a customer.
 * void compute()-To compute the rental charge:-
 * First five days
 * Rs.500 per day
 * Next five days
 * Rs.400 per day
 * Rest of the days
 * Rs.200 per day
 * void display()-To display the details
 * Write a main method to create object of a class and call the above member methods.
 */

import java.util.*;
class Mo_Bike
{
    String bno, name;
    Long phno;
    int days, charge;
    //main method
    public static void main()
    {
        Mo_Bike mo = new Mo_Bike();
        mo.input();
        mo.compute();
        mo.display();
    }
    //void input()-To accept the details of a customer.
    void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        name =  in.nextLine();
        System.out.println("Enter the Bike number: ");
        bno = in.nextLine();
        System.out.println("Enter your Phone Number: ");
        phno =  in.nextLong();
        System.out.println("Enter the number of Days: ");
        days = in.nextInt();
    }
    //void compute()-To compute the rental charge
    void compute()
    {
        int remainingdays;
        /*
         * First five days
         * Rs.500 per day
         */
        if (days <= 5)
        {
            charge = 500 * days ;
        }
        /*
         *  Next five days
         * Rs.400 per day
         */
        else if (days > 5 && days <= 10)
        {
            remainingdays = days-5;
            charge = (500 * 5) +  (remainingdays * 400);
        }
        /*
         * Rest of the days
         * Rs.200 per day
         */
        else if (days > 10)
        {
            remainingdays = days - 10;
            charge = (500 * 5) + (400 * 5) + (200 * remainingdays);
        }
    }
    //void display()-To display the details
    void display()
    {
        System.out.println("Your Name is: " + name);
        System.out.println("Your Bike Number is: " + bno);
        System.out.println("Your Phone Number is: " + phno);
        System.out.println("The number of Days you want for: " + days);
        System.out.println("The Price you have to pay is:" + charge);
    }
}