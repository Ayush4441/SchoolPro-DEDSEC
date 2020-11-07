/*
 * 4.Define a class employee as described below:-
Data Members:-Name, pan, taxable income, tax
Member Methods:-
void input()-To accept pan number, name, taxable income
void compute()-To compute the tax
<=100000 0%
100001-150000 10% of the income exceeding 100000
150001-250000 5000+20% of the income exceeding 150000
>250000 25000+ 30% of the income exceeding 250000
void display()-To display the details of the employee.
Write a main method to create object of a class and call the above member methods�
 */
import java.util.*;
class Employee
{
    String Name, pan;
    double taxable_income, tax;
    public static void main()
    {
       Employee em = new Employee();
       em.input();
       em.compute();
       em.display();
    }
    
    void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        Name = in.nextLine();
        System.out.println("Enter your Pan number");
        pan = in.nextLine();
        System.out.println("Enter your taxable income:");
        taxable_income = in.nextDouble();
    }
    
    void compute()
    {
        double rate;
        if (taxable_income <= 100000 )
        {
            rate = 0;
            tax = (taxable_income * rate);
        }
        else if (taxable_income >= 100000 && taxable_income <= 150000)
        {
           rate = 0.10;
           tax = (taxable_income * rate);
        }
        else if (taxable_income >= 150000 && taxable_income <= 250000)
        {
           rate = 0.20;
           tax = (taxable_income * rate) + 5000;
        }
        else if (taxable_income >= 250000)
        {
           rate = 0.30;
           tax = (taxable_income * rate) + 25000;
        }
    }
    
    void display()
    {
        System.out.println("Your Name is :"+ Name );
        System.out.println("Your pan number is :"+ pan);
        System.out.println("Your taxable income is :" + taxable_income);
        System.out.println("Your annual tax is :"+ tax);
    }
}