/*
 * 7. Define a class library as described below:-
 * Data Members:-acc_num, title, author
 * Member Methods:-
 * void input()-To accept the details
 * void compute()-To accept the number of days late, calculate and display the fine charged at the rate of
 * rs.2 per day.
 * void display()-To display the details.
 * Write a main method to create object of a class and call the above member methods.
*/
import java.util.*;
class library
{
    String acc_num, title, author;
    int charge, late;
    public static void main()
    {
       library lib = new library();
       lib.input();
       lib.compute();
       lib.display();
    }
    void input()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter your Account number: ");
        acc_num = in.nextLine();
        System.out.println("Enter the book title: ");
        title = in.nextLine();
        System.out.println("Enter the Author: ");
        author = in.nextLine();
        System.out.println("Enter the days you are late: ");
        late = in.nextInt();
    }
    void compute()
    {
        int rate = 2;
        charge = late * rate;
    }
    void display()
    {
        System.out.println("Your Account number is: " + acc_num);
        System.out.println("The book title is: " + title);
        System.out.println("The Author is: " + author);
        System.out.println("You have to pay Rs" + charge + " for being late");
    }
}
