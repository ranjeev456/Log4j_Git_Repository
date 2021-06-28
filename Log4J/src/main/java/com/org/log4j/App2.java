package com.org.log4j;

import org.apache.log4j.Logger;

public class App2 
{
	
	static Logger log=Logger.getLogger(App2.class.getName());
    public static void main( String[] args )
    {
    	System.out.println( "Hello World!" );
    	log.debug("Hello this is a debug message");
    	log.info("Hello this is an info message");
    	log.info("Hello this ia an info mesage from ranjeev");
    	log.info("Hello this changed has been done by software engineer");
    	log.debug("Hello this is a debug message");
    	log.info("Hello this is an info message");
    	log.info("Hello this ia an info mesage from ranjeev");
    	log.info("Hello this changed has been done by software engineer");
    }
}
