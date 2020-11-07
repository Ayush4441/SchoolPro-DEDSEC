/*
 * 8. Design a class to overload a function polygon() as follows:-
 * (a)void polygon(int n, char ch)-to draw a filled square of side n using the character stored in ch.
 * (b) void polygon(int x, int y)-to draw a filled rectangle of length x and breadth y using the symbol ‘@’.
 * (c) void polygon()-to draw a filled triangle.
 *  *
 *  **
 *  ***
 */
import java.util.*;
class poly_gon
{
    void polygon(int n, char ch)
    {
         for ( int i = 0; i < n; i++)
        {

            System.out.println();

            for ( int j = 0; j < n; j++)
            {   
                System.out.print(ch);
            }
        }
    }
    void polygon(int x, int y)
    {
         for (int i = 1; i <= y; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.print('@');
            }
            System.out.println();
        }
    }
    void polygon()
    {
        for (int i = 1; i <= 3; i++) { 
            for (int j = 3; j >= i; j--) { 
                System.out.print(" "); 
            } 
            for (int j = 1; j <= i; j++) { 
                System.out.print("* "); 
            } 
            System.out.println(); 
        }
    }
}