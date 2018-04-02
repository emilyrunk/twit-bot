import twitter4j.*;

import java.util.List;

public class Main {
    public static void main(String args[]){
        Credentials c = new Credentials();
        Twitter twitterInstance = c.setCredentials();

        TwitterHelper th = new TwitterHelper();
        /* Command to enter new status */
        th.enterNewStatus(twitterInstance);



        /* Command to get a user's tweets */
        List<Status> tweets = th.enterUserNameForTweets(twitterInstance);
        for (Status s : tweets) {
            System.out.println(s.getText());
        }

    }
}
