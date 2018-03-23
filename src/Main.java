import twitter4j.conf.ConfigurationBuilder;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String args[]){

        try {
            loadCredentials lc = new loadCredentials();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        ConfigurationBuilder cb = new ConfigurationBuilder();
//        cb.setDebugEnabled(true)
//            .setOAuthConsumerKey()
//

    }
}
