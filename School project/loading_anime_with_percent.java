class loading_anime_with_percent
{
    public static void main ()throws InterruptedException
    {
        loading_anime_with_percent t = new loading_anime_with_percent();
        t.Loading_anime();
    }
    void Loading_anime()throws InterruptedException
    {
        for (int i = 0;i<101;i++){

          Thread.sleep(25);
          System.out.print("Loading ["+i+"%]");
          Thread.sleep(50);
          System.out.print('\u000C');
        }
        System.out.print('\u000C');
    }
}
