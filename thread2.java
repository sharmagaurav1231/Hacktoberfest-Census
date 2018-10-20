class A extends Thread
{
  public void run()
  {
    System.out.println("Inside thread A:");
    for(int i=1;i<=5;i++)
    {
      System.out.println("Thread A:"+i);
      if(i==3)
       {
         try
         {
           stop();
         }
         catch(Exception e)
         {}
       }    
    }
    System.out.println("Exiting thread A");
  }
}
class B extends Thread
{
  public void run()
  {
    System.out.println("Inside thread B:");
    for(int i=1;i<=5;i++)
    {
      System.out.println("Thread B:"+i);
    }
    System.out.println("Exiting thread B");
  }
}
class thread2
{
   public static void main(String arg[])
   {
     A threada =new A();
     B threadb=new B();
     threada.start();
     threadb.start();
     System.out.println("Thread is alive:"+threada.isAlive());
     try
     {
       threada.join();
       threadb.join();
     }
     catch(Exception e)
     {}
     System.out.println("Thread is alive:"+threada.isAlive());
     System.out.println("Exiting main");
     }
}