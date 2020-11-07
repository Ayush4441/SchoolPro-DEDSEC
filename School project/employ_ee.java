/*
 * 6. Define a class employee as described below:-
Data Members:-Name, taxable income, tax
Member Methods:-
void input()-To accept name, taxable income
void compute()-To compute the tax
<=160000 0%
160001-500000 (ti-160000) X 10%
500001-800000 [(ti-500000) X 20%]+34000
>800000 [(ti-800000) X 30%]+94000
void display()-To display the details of the employee.
Write a main method to create object of a class and call the above member methods.
 */
import java.util.*;
class employ_ee
{
    String name;
    Double taxable_income, tax;
    
    public static void main()
    {
        employ_ee ee = new employ_ee();
        ee.input();
        ee.compute();
        ee.display();
        
    }
    void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        name = in.nextLine();
        System.out.println("Enter your taxable income:");
        taxable_income = in.nextDouble();
    }
    void compute()
    {
        double rate;
        if (taxable_income <=160000 )
        {
            rate = 0;
            tax = (taxable_income * rate);
        }
        else if (taxable_income >= 160000 && taxable_income <= 500000)
        {
           rate = 0.10;
           tax = ((taxable_income - 160000) * rate) ;
        }
        else if (taxable_income >= 500000 && taxable_income <= 800000)
        {
           rate = 0.20;
           tax = ((taxable_income - 500000) * rate) + 34000;
        }
        else if (taxable_income >= 800000)
        {
           rate = 0.30;
           tax = ((taxable_income - 800000) * rate) + 94000;
        }
    }
    void display()
    {
        System.out.println("Your Name is :"+ name );
        System.out.println("Your taxable income is :" + taxable_income);
        System.out.println("Your annual tax is :"+ tax);
    }
}