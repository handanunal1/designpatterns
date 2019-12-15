package org.designpatterns;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App {

	private static final Logger logger = Logger.getLogger(App.class.getName());

	public static void main(String[] args) {

		logger.setLevel(Level.FINEST);
		ConsoleHandler handler = new ConsoleHandler();
		//level to publish at
		handler.setLevel(Level.FINEST);
		logger.addHandler(handler);
		
		logger.finest("Finest level of logging");
		logger.finer("Finer level, but not as fine as finest");
		logger.fine("Fine, but not as fine as finer or finest");
	}
}
