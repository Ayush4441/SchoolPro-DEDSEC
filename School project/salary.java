/*
 2.Define a class salary as described below:-
 Data Members:-Name, address, phone, specialization, monthly salary, income tax
 Member Methods:-
 void input()-To accept the details of an employee including the monthly salary..
 void compute()-To compute the annual income tax at 5% of the annual salary above Rs.1,75,000/-
 void display()-To display the details of the employee
 Write a main method to create object of a class and call the above member methods.
*/

import java.util.*;
class salary{
    String Name, address, specialization;
    double monthly_salary, income_tax;
    long phone;
    double tax;
    //main method
    public static void main(){
       salary sa = new salary();
       sa.input();
       sa.compute();
       sa.display();
    }
    //void input()-To accept the details of an employee including the monthly salary..
    void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        Name = in.nextLine();
        System.out.println("Enter your address:");
        address = in.nextLine();
        System.out.println("Enter your specialization:");
        specialization = in.nextLine();
        System.out.println("Enter your monthly_salary:");
        monthly_salary = in.nextDouble();
        System.out.println("Enter your phone:");
        phone = in.nextLong();
    }
    //void compute()-To compute the annual income tax at 5% of the annual salary above Rs.1,75,000/-
    void compute(){
        double annual_salary = monthly_salary * 12;
        
        if (annual_salary >= 175000){
            income_tax = 0.05;
             tax = annual_salary * income_tax;
        }
        else{
            income_tax = 0;
             tax = annual_salary * income_tax;
        }
    }
    //void display()-To display the details of the employee
    void display(){
        System.out.println("Your Name is :"+Name );
        System.out.println("Your address is :"+address);
        System.out.println("Your specialization is :"+specialization);
        System.out.println("Your monthly_salary is :" +monthly_salary);
        System.out.println("Your phone is :"+phone);
        System.out.println("Your annual tax is :"+ tax);
    }
}
