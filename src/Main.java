import twitter4j.*;

import java.io.File;
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
        try {
            FileManagement.loadFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
