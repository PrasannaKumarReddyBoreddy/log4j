package com.tyss.log4j;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.XMLLayout;

public class Log4jTest {
	public static void main(String[] args) {
		PropertyConfigurator.configure("loggerConfig.properties");
		Logger logger = Logger.getLogger(Log4jTest.class);
		
		logger.trace("this is the trace msg.....");
		logger.debug("this is the Debug msg......");
		logger.info("this is the info msg........");
		logger.warn("this is the warn msg.........");
		logger.error("this is the error msg........");
		logger.fatal("this is the fatal msg..........");
	}
}
