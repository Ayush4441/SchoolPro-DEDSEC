/*
3.Design a class to overload a function compare() as follows:-
(a)void compare(int, int)-to compare two integer values and print the greater of the two integers.
(b)void compare(char, char)-to compare two characters numeric values and print the greater of the two
(c)void compare(int ,int ,int)-to compare three integer values and print the greater of the three integers
 */

class compare {
    //(a)void compare(int, int)-to compare two integer values and print the greater of the two integers.
    void compare(int var1, int var2){
        if (var1 > var2){
            System.out.println(var1 + "Greater than " + var2);
        }
        else{
            System.out.println(var2 + "Greater than " + var1);
        }
    }
    //(b)void compare(char, char)-to compare two characters numeric values and print the greater of the two.
    void compare(char ch1, char ch2){
        int temp_1 = ch1;
        int temp_2 = ch2;
        if (temp_1 > temp_2){
            System.out.println(ch1 + "Greater than " + ch2);
        }
        else{
            System.out.println(ch2 + "Greater than " + ch1);
        }
    }
    //(c)void compare(int ,int ,int)-to compare three integer values and print the greater of the three integers.
    void compare(int a ,int b,int c){
        if (a > b && a > c){
            System.out.println(a + "Greater than " + b +" and "+ c);
        }
        else if (b > c && b > a){
            System.out.println(b + "Greater than " + a +" and "+ c);
        }
        else if (c > a && c > b){
            System.out.println(c + "Greater than " + a +" and "+ b);
        }
    }
    //
}