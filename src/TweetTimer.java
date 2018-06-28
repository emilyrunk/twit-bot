import java.util.TimerTask;

public class TweetTimer extends TimerTask{
    @Override
    public void run() {

    }

    private void completeTask() {
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
