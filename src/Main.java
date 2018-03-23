import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String args[]){
        Credentials c = new Credentials();
        Twitter twitterInstance = c.setCredentials();
        StatusUpdate sd = new StatusUpdate("Test post - Twit Bot");
        try {
            Status status = twitterInstance.updateStatus(sd);
        } catch (TwitterException e) {
            e.printStackTrace();
        }

    }
}
