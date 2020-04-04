package pkg;

import org.tinylog.Logger;

public class main {
    public static void main(String[] args) {
        Logger.error("This is an ERROR message");
        Logger.warn("THis is a WARN string");
        Logger.info("This is an INFO message");
        Logger.debug("This is a DEBUG message");
        Logger.trace("This is a TRACE message");
        //Logger.info("User's name is "+System.getProperty("user.name"));
        Logger.info("User's name is {}",System.getProperty("user.name")); //this is more efficient than above. becuase if no logging is enabled no string concat
        Logger.error(new RuntimeException("Oops"),"Something is wrong");


    }
}
