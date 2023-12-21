package chap5;

import java.util.logging.Logger;

public class LogTest {
	// Logger
	static final Logger logger = Logger.getLogger(LogTest.class.getName());

	public static void main(String[] args) {
		logger.info("Info message");
		logger.warning("Warning message");
		logger.severe("Severe message");
	}
}
