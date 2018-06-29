import twitter4j.*;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Main {


    public static void main(String args[]) {

        TwitterHelper th = new TwitterHelper();


        /* Command to enter new status */
        //th.enterNewStatus(twitterInstance);


        /* Command to get a user's tweets */
//        List<Status> tweets = th.enterUserNameForTweets(twitterInstance);
//        for (Status s : tweets) {
//            System.out.println(s.getCreatedAt() + s.getText());
//        }


        /* Load file here and update status (Tweet) */



        /* Timer stuff */
        TimerTask timerTask = new TweetTimer(th);
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(timerTask, 0, 10 * 1000);
        System.out.println("TimerTask started");

        //cancel after some time
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        timer.cancel();




        /* Write tweet to schedule */

//        List<Status> tweetList = th.enterUserNameForTweets(twitterInstance);
//        for (Status s : tweetList) {
//            try {
//                BufferedWriter writer = new BufferedWriter(new FileWriter(sm.fileName,true));
//                writer.newLine();
//                writer.append(s.getCreatedAt() + s.getText());
//                writer.flush();
//                writer.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }
}

