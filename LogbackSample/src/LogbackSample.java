

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;



/**
 * Created by allwin on 13/6/16.
 */
public class LogbackSample {

    private static final Logger logger= (Logger) LoggerFactory.getLogger(LogbackSample.class);

    String message(String message){
        return message;
    }
    public static void main(String[]args){
    logger.trace("This is trace message");

    LogbackSample lx= new LogbackSample();

    System.out.println(lx.message("hello"));

    logger.debug("Starting debugging");

    logger.error("It is error");

    logger.info("Ending debugging");

}
}
