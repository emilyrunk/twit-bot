import java.util.Date;
import java.util.TimerTask;

public class TweetTimer extends TimerTask{
    @Override
    public void run() {
        System.out.println("Timer task started at: " + new Date());
        completeTask();
        System.out.println("Timer task finished at: " + new Date());
    }

    private void completeTask() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
