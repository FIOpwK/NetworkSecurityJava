package ibm.network.security;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NetworkSecurityTestBool {
	@BeforeEach
	void setUp() {
	}

	@Test
	void testNetworkSecurityStringBoolean() {
		NetworkSecurity nx = new NetworkSecurity("set", false);
		assertEquals(false, nx.getMatchFound("set"));
		
	}

}
