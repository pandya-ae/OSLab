package JavaApplication1;   

class RunnableDemo implements Runnable 
{
    private Thread t;
    private String threadName;
    int a = 0;

    RunnableDemo(String name) 
    {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() 
    {
        System.out.println("Running " + threadName) ;
        try 
        {
            for(int i = 0; i < 2; i++) 
            {
                a++;
                System.out.println("Nilai: " + a + " , " + threadName);
                Thread.sleep(50);
            }
        }
        catch (InterruptedException e) 
        {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start () 
    {
        System.out.println("Starting " + threadName);
        if (t == null)
        {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}

public class JavaApplication1 {
    public static void main(String args[])
    {
        RunnableDemo R1 = new RunnableDemo("Thread-1");
        R1.start();

        RunnableDemo R2 = new RunnableDemo("Thread-2");
        R2.start();
    }
}