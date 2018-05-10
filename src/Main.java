import twitter4j.*;

import java.io.FileNotFoundException;
import java.io.IOException;

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
            sm.readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
