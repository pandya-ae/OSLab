package MulthreadMessage;

public class MulthreadMessage 
{
    public static void main(String [] args) 
    {
       Runnable hello = new ShowMessage("Halo, saya Thread-1!");
       Thread thread1 = new Thread(hello);
       thread1.setDaemon(true);
       thread1.setName("halo");
       System.out.println("Starting Thread-1.");
       thread1.start();

       Runnable bye = new ShowMessage("Hey, I'm Thread-2!");
       Thread thread2 = new Thread(bye);
       thread2.setPriority(Thread.MIN_PRIORITY);
       thread2.setDaemon(true);
       System.out.println("Starting Thread-2.");
       thread2.start();

       System.out.println("Starting Thread-3.");
       Thread thread3 = new ShowNumber(27);
       thread3.start();
       try 
       {
          thread3.join();
       } 
       catch (InterruptedException e) 
       {
          System.out.println("Thread interrupted.");
       }
       System.out.println("Starting Thread-4");
       Thread thread4 = new ShowNumber(75);
       
       thread4.start();
       System.out.println("Main driver is stopping.");
    }
 }