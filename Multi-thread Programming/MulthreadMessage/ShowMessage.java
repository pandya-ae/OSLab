package MulthreadMessage;

public class ShowMessage implements Runnable {
    private String message;
    
    public ShowMessage(String message) {
       this.message = message;
    }
    
    public void run() {
       while(true) {
          System.out.println(message);
       }
    }
 }