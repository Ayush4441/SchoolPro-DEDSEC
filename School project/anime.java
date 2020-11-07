class anime
{
    public static void main ()throws InterruptedException
    {
        anime t = new anime();
        t.Loading_anime();
    }
    void Loading_anime()throws InterruptedException
    {
        for (int i = 0;i<25;i++){
          
          Thread.sleep(50);
          System.out.print("Loading [|]");
          Thread.sleep(50);
          System.out.print('\u000C');
          System.out.print("Loading [/]");
          Thread.sleep(50);
          System.out.print('\u000C');
          System.out.print("Loading [-]");
          Thread.sleep(50);
          System.out.print('\u000C');
          System.out.print("Loading [\\]");
          Thread.sleep(50);
          System.out.print('\u000C');
        }
        System.out.print('\u000C');
    }
}
