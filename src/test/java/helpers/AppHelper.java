package helpers;


import java.io.File;
import java.io.IOException;
import static helpers.Const.*;

/**
 * Created by roman on 10/10/16
 */
public class AppHelper {

    public  void runApplicationLocally(){

        ProcessBuilder pb =
                new ProcessBuilder(PATH, "sudo -jar", "test-slider-1.0.0-SNAPSHOT.jar");
        try {
            Process p = pb.start();
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
