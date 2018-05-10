import java.io.File;
import java.io.IOException;

public class FileManagement {

    private static final String SCHEDULE = "schedule.txt";



    public static void loadFile() throws IOException {
        File f = new File(SCHEDULE);

        if (f.createNewFile()) {
            System.out.println("File has been created.");
        } else {
            System.out.println("File already exists.");
        }
    }

    public 


}
