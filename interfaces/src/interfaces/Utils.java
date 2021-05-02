package interfaces;

public class Utils {
	public static void runlogges(Logger[] loggers, String message) {
		for(Logger logger: loggers) {
			logger.log(message);
		}
	}

}
