import twitter4j.Status;
import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwitterHelper {


    public void enterNewStatus(Twitter twit) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Status update: ");
        StatusUpdate sd = new StatusUpdate(inputScanner.nextLine());

        try {
            Status status = twit.updateStatus(sd);
            System.out.println("Your tweet, \"" + sd.toString() + "\" was posted successfully.");
        } catch (TwitterException e) {
            e.printStackTrace();
        }
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
