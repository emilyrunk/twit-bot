import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class ScheduleManager {

    private static final String SCHEDULE = "schedule.txt";

    File fileName = new File(SCHEDULE);



    public void loadFile(File fileName) throws IOException {

        if (fileName.createNewFile()) {
            System.out.println("File has been created.");
        } else {
            System.out.println("File already exists.");
        }
    }

    public List<String> readFile() throws FileNotFoundException {
        ArrayList<String> listOfTweets = new ArrayList<String>();
        Scanner fileScanner = new Scanner(fileName);
        while (fileScanner.hasNextLine()) {

            String line = fileScanner.nextLine();
            listOfTweets.add(line);
        }
        return listOfTweets;
    }
}
