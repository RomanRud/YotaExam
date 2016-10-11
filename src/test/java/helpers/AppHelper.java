package helpers;


import java.io.File;
import java.io.IOException;

/**
 * Created by roman on 10/10/16
 */
public class AppHelper {

    public  void runApplicationLocally(){

        ProcessBuilder pb =
                new ProcessBuilder("/Users/roman/Documents/IdeaProjects/YotaExam/src/main/resources/test-slider-1.0.0-SNAPSHOT.jar", "sudo -jar", "test-slider-1.0.0-SNAPSHOT.jar");
        try {
            Process p = pb.start();
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
