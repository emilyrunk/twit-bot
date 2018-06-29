import twitter4j.Twitter;

import java.util.Date;
import java.util.TimerTask;

public class TweetTimer extends TimerTask{
    TwitterHelper th;

    TweetTimer(TwitterHelper thelp) {
        th = thelp;
    }

    @Override
    public void run() {
        System.out.println("Timer task started at: " + new Date());
        th.nextTweet();
        System.out.println("Timer task finished at: " + new Date());
    }


}
