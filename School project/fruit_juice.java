/*
 * 9.Define a class fruit juice as described below:-
 * DataMembers:-product_code,flavour,pack_type,pack_size,product_price
 * Member Methods:-
 * fruit juice()-Default constructor to initialize integer data members to 0 and String data members to “ “
 * void input()-To accept the details
 * void discount()-To reduce the product price by 10.
 * void display()-To display the details.
 * Write a main method to create object of a class and call the above member methods.(2013)
 */

import java.util.*;
class fruit_juice
{
    String flavour,pack_type, product_code;
    double pack_size,product_price;
    public static void main()
    {
        fruit_juice fj = new fruit_juice();
        fj.input();
        fj.discount();
        fj.display();
    }
    fruit_juice()
    {
        product_code = "";
        flavour = "";
        pack_type = " ";
        pack_size = 0;
        product_price = 0;
    }
    void input()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter your Product Code: ");
        product_code = in.nextLine();
        System.out.println("Enter your flavour: ");
        flavour = in.nextLine();
        System.out.println("Enter your Pack Type: ");
        pack_type = in.nextLine();
        System.out.println("Enter your Pack Size: ");
        pack_size = in.nextDouble();
        System.out.println("Enter Product Price: ");
        product_price = in.nextDouble();
    }
    void discount()
    {
        double discount = 0.10;
        product_price = product_price - (product_price * discount)   ;
    }
    void display()
    {
        System.out.println("Your Product Code: " + product_code);
        System.out.println("Your flavour: " + flavour);
        System.out.println("Your Pack Type: " + pack_type);
        System.out.println("Your Pack Size: " + pack_size);
        System.out.println("Your product price with discount: " + product_price);
    }
    
}