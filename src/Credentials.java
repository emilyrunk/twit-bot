import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Credentials {

    HashMap<String, String> credentialsHM = new HashMap<>();
    private static final String CONSUMER_KEY = "consumerKey";
    private static final String CONSUMER_SECRET = "consumerSecret";
    private static final String ACCESS_TOKEN = "accessToken";
    private static final String ACCESS_TOKEN_SECRET = "accessTokenSecret";



    public Credentials() {
        loadCredentials();
    }

    public Twitter setCredentials() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(this.getValue(CONSUMER_KEY))
                .setOAuthConsumerSecret(this.getValue(CONSUMER_SECRET))
                .setOAuthAccessToken(this.getValue(ACCESS_TOKEN))
                .setOAuthAccessTokenSecret(this.getValue(ACCESS_TOKEN_SECRET));

        TwitterFactory tf = new TwitterFactory(cb.build());
        return tf.getInstance();
    }

    private String getValue(String key) {
        return credentialsHM.get(key);

    }

    public String toString() {
        String val = "";
        for (HashMap.Entry<String,String> entry: credentialsHM.entrySet()){
            val += entry.getKey() + "=(" + entry.getValue() + ")\n";
        }
        return val;
    }



    private void loadCredentials() {
        File file = new File("credentials.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (scanner.hasNextLine()){
            String[] line = parseCredentials(scanner.nextLine());
            credentialsHM.put(line[0], line[1]);
        }
        System.out.println("Loading credentials...");
        System.out.println(this);
    }

    private String[] parseCredentials(String nextLine){
        String[] parts = nextLine.split("=");
        String credentialType = parts[0];
        String key = parts[1];
        return new String[] {credentialType, key};

    }


}
