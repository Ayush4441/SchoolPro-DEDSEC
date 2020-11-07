/*
 * 
1.Design a class number with the following functions:
void Special(int) to check and print if the given number is a special number.
int DecimalToBinary() that reads a decimal integer and returns its Binary Equivalent.
boolean Palindrome() to read an integer and returns if the entered number is Palindrome or not.
Call all the functions in main.
 *
 */


import java.util.*;
class scanner{
	static int decimal;
	//main method
	public static void main() {
		scanner ab = new scanner();
		ab.Special(0);
		ab.toBinary(decimal);
		ab.Palindrome();
          }
          //void Special(int) to check and print if the given number is a special number.
	void Special(int num) {
		Scanner sp = new Scanner (System.in);
		System.out.println("Enter the number to be checked");
		 num = sp.nextInt();
		 int sum = 0;
		 int temp = num;
		 while(temp!=0)
	        {
	            int a=temp%10;int fact=1;
	            for(int i=1;i<=a;i++)
	            {
	                fact=fact*i;
	            }
	            sum=sum+fact;
	            temp=temp/10;
	        }
	        if(sum==num)
	        {
	            System.out.println(num+" is a Special Number.");
	        }
	        else
	        {
	            System.out.println(num+" is not a Special Number.");
	        }
		
	}
	public void toBinary(int decimal){  
		Scanner de = new Scanner (System.in);
		System.out.println("Enter a decimal number");
		decimal =  de.nextInt();
	     int binary[] = new int[40];    
	     int index = 0;    
	     while(decimal > 0){    
	       binary[index++] = decimal%2;    
	       decimal = decimal/2;    
	     } 
	     System.out.println("Binary number is: ");
	     for(int i = index-1;i >= 0;i--){    
	       System.out.print(binary[i]);
	       
	     }
	     
	     System.out.println();
	} 
	public void Palindrome() {
                Scanner pa = new Scanner(System.in);
	        int num, reversedInteger = 0, remainder, originalInteger;
	        System.out.println("Enter a number to check if it is a palindrome or not: ");
                num = pa.nextInt();
	        originalInteger = num;

	        // reversed integer is stored in variable 
	        while( num != 0 )
	        {
	            remainder = num % 10;
	            reversedInteger = reversedInteger * 10 + remainder;
	            num  /= 10;
	        }
	        // palindrome if orignalInteger and reversedInteger are equal
                 if (originalInteger == reversedInteger)
                         System.out.println(originalInteger + " is a palindrome.");
                 else
                         System.out.println(originalInteger + " is not a palindrome.");
    }
         
}