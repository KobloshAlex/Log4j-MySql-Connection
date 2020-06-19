package com.cogent.info;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("Log4j 2 Example ");
        logger.error("Runtime error..");
    }
}
