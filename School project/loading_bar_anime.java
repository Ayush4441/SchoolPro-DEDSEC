class loading_bar_anime
{
    public static void main()throws InterruptedException
    {
        String a ="#";
        System.out.print("Loading ");
        for(int i = 0;i<101;i++)
        {
        String p = a;
        
        System.out.print(a);
        Thread.sleep(50);
        
        }
        System.out.print('\u000C');
    }
}