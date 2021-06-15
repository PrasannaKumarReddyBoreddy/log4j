package com.tyss.mypackage;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = Logger.getLogger(MyClass.class);
		logger.setLevel(Level.ALL);
		ConsoleAppender appender = new ConsoleAppender();
		
		logger.addAppender(appender);

		logger.trace("this is the trace msg.....");
		logger.debug("this is the Debug msg......");
		logger.info("this is the info msg........");
		logger.warn("this is the warn msg.........");
		logger.error("this is the error msg........");
		logger.fatal("this is the fatal msg..........");

	}

}
