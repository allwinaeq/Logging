package log4j;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Created by allwin on 13/6/16.
 */




public class SampleLog4j implements Runnable

{
    Logger logger = LogManager.getLogger(SampleLog4j.class);
    String id = "id1";
    String symbol = "@";
    Thread thrd = null;

    public void run()
    {
        try {
            logger.fatal("Fatal Message");
            Thread.sleep(1000);

            logger.trace("Trace");
            Thread.sleep(1000);

            logger.debug("Debug Message");
            Thread.sleep(1000);

            logger.info("Info Message!");
            Thread.sleep(1000);

            logger.warn("Warn Message");
            Thread.sleep(1000);

            logger.error("Error Message");




        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void start()
    {
        thrd=new Thread(this);
        thrd.start();
    }

    public static void main(String[] args) throws InterruptedException
    {
SampleLog4j log1= new SampleLog4j();

        SampleLog4j log2= new SampleLog4j();

        log1.start();
        log2.start();


    }
}