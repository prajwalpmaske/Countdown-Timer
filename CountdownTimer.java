import java.util.Timer;
import java.util.TimerTask;

public class CountdownTimer {
    public static void main(String[] args) {
        int seconds = 10; // Set the countdown time in seconds
        Timer timer = new Timer();
        
        timer.scheduleAtFixedRate(new TimerTask() {
            int count = seconds;

            public void run() {
                System.out.println(count);
                count--;

                if (count < 0) {
                    System.out.println("Happy Birthday");
                    timer.cancel();
                }
            }
        }, 0, 1000); // Schedule the task to run every 1000 milliseconds (1 second)
    }
}
