import twitter4j.*;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {


    public static void main(String args[]){
        Credentials c = new Credentials();
        Twitter twitterInstance = c.setCredentials();

        TwitterHelper th = new TwitterHelper();
        /* Command to enter new status */
        //th.enterNewStatus(twitterInstance);



        /* Command to get a user's tweets */
//        List<Status> tweets = th.enterUserNameForTweets(twitterInstance);
//        for (Status s : tweets) {
//            System.out.println(s.getCreatedAt() + s.getText());
//        }

        /* Load file here */
        ScheduleManager sm = new ScheduleManager();
        try {
            sm.loadFile(sm.fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            List<String> tweetList = sm.readFile();
            for (String tweet : tweetList){
                twitterInstance.updateStatus(tweet);
                System.out.println("Status updated: " + tweet);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (TwitterException e) {
            e.printStackTrace();
        }



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
