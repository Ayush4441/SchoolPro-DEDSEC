class test_System_loading
{
    public static void main()throws InterruptedException
    {
        test_System_loading obj = new test_System_loading();
        obj.sytem_loading();
        obj.anime_sequence();
        obj.ctOS();
        
    } 
    void sytem_loading()throws InterruptedException
    {
        System.out.println("▓▓▓▓");
        System.out.print("▓▓▓▓");
        for (int r = 0;r < 6; r++)
        {
            System.out.print("▓");
            Thread.sleep(250);
        }
        System.out.println();
        System.out.print("System loading ");
        for (int r = 0 ; r < 3 ; r++ )
        {
            System.out.print(".");
            Thread.sleep(250);
        }
        System.out.println();
        System.out.print("▓▓▓▓▓");
        for (int r = 0;r < 12; r++)
        {
            System.out.print("▓");
            Thread.sleep(125);
        }
        Thread.sleep(400);
        System.out.print('\u000C');
        for (int r = 0; r < 5; r++)
        {
            System.out.println("▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            Thread.sleep(100);
            System.out.print('\u000C');
            Thread.sleep(250);
        }
    }
    void anime_sequence()throws InterruptedException
    {
        for (int l = 0; l < 7; l++)
        {
            System.out.println();
            System.out.println();
            System.out.println(">>Boot Sequence");
            Thread.sleep(150);
            System.out.print('\u000C');
            Thread.sleep(100);
        }
    }
    void ctOS()throws InterruptedException
    {
       for (int l = 0; l < 7; l++)
        {
            System.out.println();
            System.out.println();
            System.out.println("ctOS");
            System.out.println("Xxxxxx Xxxxxx");
            System.out.println("Grid App");
            Thread.sleep(150);
            System.out.print('\u000C');
            Thread.sleep(100);
        }
       for(int l = 0; l < 7 ; l++)
       {
           System.out.println("");
       }
    }
}
