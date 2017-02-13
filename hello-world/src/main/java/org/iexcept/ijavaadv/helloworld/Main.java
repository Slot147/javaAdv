package org.iexcept.ijavaadv.helloworld;

import org.apache.log4j.Logger;

public class Main {
	final static Logger logger = Logger.getLogger(Main.class.getName());
	public static void main(String[] args) {

		//System.out.println("Hello Maven!!!");
		System.out.println(logger.getName());

		if(logger.isDebugEnabled()){
			logger.debug("debughello world args.length" + args.length);
		}
	}
}