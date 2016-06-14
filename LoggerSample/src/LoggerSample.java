import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by allwin on 13/6/16.
 */
public class LoggerSample {

    private static final Logger LOGGER= Logger.getLogger(LoggerSample.class.getName());
    public static void main(String[]args) throws SecurityException, IOException {

    LOGGER.info("Logger Name:" +LOGGER.getName());

        LOGGER.warning("Will cause ArrayIndexOutOfBoundsException");

        int []z={1,2,3};

        int index=4;

        LOGGER.config("index is set to" +index);

        try {
            System.out.println(z[index]);
        }

        catch (ArrayIndexOutOfBoundsException ex){

            LOGGER.log(Level.SEVERE, "Exception occur", ex);
        }
    }


}
