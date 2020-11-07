/*
 * 10.Design a class to overload a function series() as follows:-
 * double series(double n) with one double argument and returns the sum of the series. Sum=1/1+1/2+1/3….1/n
 * double series(double a, double n) returns sum of series. Sum=1/a2+4/a5+7/a8+10/a11+…..to n terms
 */
import java.util.*;
class series
{
    static double series(double n) 
    { 
      double i, s = 0.0; 
      for (i = 1; i <= n; i++)
      { 
          s = s + 1/i;
      } 
      return s; 
    } 
    static double series(double a, double n) 
    { 
      double i, s = 0.0; 
      for (; a <= n;)
      { 
          s = s + 1/a;
      } 
      return s; 
    } 
}