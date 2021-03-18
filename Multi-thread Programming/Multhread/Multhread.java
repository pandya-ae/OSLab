package Multhread;

class RunnableDemo implements Runnable 
{
    private Thread t;
    private String threadName;
    String[] message = {"Halo, saya Thread #1!", "Hello, I'm Thread #2!", "¡Hola, soy Thread #3!", "Hallo, ich bin Thread #4!"};

    RunnableDemo(String name) 
    {
        threadName = name;
        System.out.println("Creating Thread #" + threadName);
    }

    public void run() 
    {
        System.out.println("Running Thread #" + threadName);
        try 
        {
            System.out.println("Message from Thread #" + threadName + ": " + message[(Integer.parseInt(threadName)) - 1] );
            Thread.sleep(50);
        } 
        catch (InterruptedException e) 
        {
            System.out.println("Thread #" + threadName + " interrupted.");
        }
        System.out.println("Thread #" + threadName + " exiting.");
    }

    public void start () 
    {
        System.out.println("Starting Thread #" + threadName);
        if (t == null) {
            t = new Thread (this, threadName);
            t.start();
        }
    }
}

public class Multhread 
{
    public static void main(String[] args) throws Exception 
    {
        RunnableDemo R1 = new RunnableDemo("1");
        R1.start();

        RunnableDemo R2 = new RunnableDemo("2");
        R2.start();

        RunnableDemo R3 = new RunnableDemo("3");
        R3.start();

        RunnableDemo R4 = new RunnableDemo("4");
        R4.start();
    }
}