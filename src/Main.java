import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Credentials c = new Credentials();
        Twitter twitterInstance = c.setCredentials();

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("What's the status, toots?");
        StatusUpdate sd = new StatusUpdate(inputScanner.nextLine());
        try {
            Status status = twitterInstance.updateStatus(sd);
            System.out.println("Your tweet, \"" + sd.toString() + "\" was posted successfully.");
        } catch (TwitterException e) {
            e.printStackTrace();
        }

    }
}
