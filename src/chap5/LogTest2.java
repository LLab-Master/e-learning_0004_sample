package chap5;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogTest2 {
	// Logger
	static final Logger logger = Logger.getLogger(LogTest2.class.getName());
	public static void main(String[] args) {
		Handler handler;
		try {
			// Handler
			handler = new FileHandler("testlog.log");
			logger.addHandler(handler);
			// Formatter
			Formatter formatter = new SimpleFormatter();
			handler.setFormatter(formatter);
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
		// ログレベル
		logger.setLevel(Level.CONFIG);
        // ログ出力(下に行くにしたがい、重大)
		logger.finest("Finest message");
		logger.finer("Fineer message");
		logger.fine("Fine message");
		logger.config("Config message");
		logger.info("Info message");
		logger.warning("Warning message");
		logger.severe("Severe message");
	}
}
