import twitter4j.Status;
import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwitterHelper {
    Credentials c;
    Twitter twitterInstance;
    ScheduleManager sm;


    TwitterHelper() {
        c = new Credentials();
        twitterInstance = c.setCredentials();
        sm = new ScheduleManager();
    }
    public void nextTweet() {
        try {
            sm.loadFile(sm.fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            List<String> tweetList = sm.readFile();
            int rn = (int) (tweetList.size() * Math.random());
            String randomTweet = tweetList.get(rn);
            System.out.println("Status will update with: \nRandom Number: " + rn + "\n" + "Random Tweet: " + randomTweet);
            this.tweetNewStatus(twitterInstance,randomTweet);

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }

    private void tweetNewStatus(Twitter twinstance, String twit) {
        try {
            twinstance.updateStatus(twit);
            System.out.println("Your status has been updated: " + twit);
        } catch (TwitterException e) {
            e.printStackTrace();
        }
    }

    public void enterNewStatus(Twitter twit) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Status update: ");
        String newTweet = inputScanner.nextLine();
        tweetNewStatus(twit, newTweet);
    }

    private List<Status> getUsersTweets(Twitter twit, String userName) {
        List<Status> listOfTweets = new ArrayList<>();
        try {
            listOfTweets = twit.getUserTimeline(userName);
        } catch (TwitterException e) {
            e.printStackTrace();
        }
        return listOfTweets;
    }



    public List<Status> enterUserNameForTweets(Twitter twitter) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the Twitter handle of the person you want to creep on: ");
        String user = input.nextLine();
        return getUsersTweets(twitter, user);

    }




}
