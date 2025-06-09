package com.pluralsight;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {

    private static final Logger logger = (Logger) LogManager.getLogger(Main.class);


    public static void main(String[] args) {

        logger.info("This is an INFO log");
        logger.warn("This is a warning");
        logger.error("This is an ERROR log");
        logger.debug("This is a DEBUG log");
        logger.fatal("This is a FATAL log");

    }
}
