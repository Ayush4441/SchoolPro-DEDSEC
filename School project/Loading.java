import java.util.*;
class Loading
{
    public static void main ()throws InterruptedException
    {
        Loading t = new Loading();
        Scanner br = new Scanner (System.in);
        System.out.println("Enter some thing :");
        String n = br.nextLine();
        t.Loading_anime();
    }
    void Loading_anime()throws InterruptedException
    {
       for (int i = 0;i<5;i++)
       {
          System.out.print('\u000C');
          Thread.sleep(400);
          System.out.print("Loading.");
          Thread.sleep(400);
          System.out.print(".");
          Thread.sleep(400);
          System.out.print(".");
          Thread.sleep(400);
          System.out.print('\u000C');
       }
    }
}