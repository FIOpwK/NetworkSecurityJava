package ibm.network.security;
import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(Main.class.getName());
		logger.info("Network Security: Hello, Main!");
		
		NetworkSecurity nws = new NetworkSecurity("private", false);
		
		boolean res = nws.getMatchFound("private");
		logger.info("+" + res);

	}

}
