import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

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

    public void readFile() throws FileNotFoundException {

        Scanner fileScanner = new Scanner(fileName);
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            System.out.println(line);
        }


    }


}
