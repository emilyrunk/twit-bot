import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class loadCredentials {

    public loadCredentials() throws FileNotFoundException {

        HashMap<String, String> credentials = new HashMap<>();


        File file = new File("credentials.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            String[] line = parseCredentials(scanner.nextLine());
            credentials.put(line[0], line[1]);
        }

        for (HashMap.Entry<String,String> entry: credentials.entrySet()){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }

    private String[] parseCredentials(String nextLine){
        String[] parts = nextLine.split("=");
        String credentialType = parts[0];
        String key = parts[1];
        String[] credential = {credentialType, key};
        return credential;

    }
}
