import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Credentials c = new Credentials();
        Twitter twitterInstance = c.setCredentials();

        TwitterHelper th = new TwitterHelper();
//        th.enterNewStatus(twitterInstance);



//        List<Status> tweets = th.getUsersTweets(twitterInstance, "warrenrunk");
//        for (Status s : tweets) {
//            System.out.println(s.getText());
//        }

        List<Status> tweets = th.enterUserNameForTweets(twitterInstance);
        for (Status s : tweets) {
            System.out.println(s.getText());
        }

    }
}
