package ibm.developer;

/*
L4: Explain the concepts of network security

L4.1.1: Recognize common networking terms and models

L4.1.2: Identify common protocols and ports and their secure counterparts

L4.2.1: Identify types of network (cyber) threats and attacks

L4.2.2: Discuss common tools used to identify and prevent threats
	- nessus
	- wireshark
	- IDS
	- IPS

L4.3.1: Identify common data center terminology

L4.3.2: Recognize common cloud service terminology

L4.3.3: Identify secure network design terminology

L4.4.1: Practice the terminology of and review network security concepts

*/
// we can import classes
import java.util.logging.Logger;

// we can create classes 
class NetworkSecurity {
	private String className;

	private String[] keyWordList = {"abstract",
		"assert",
		"boolean",
		"break",
		"byte",
		"case",
		"catch",
		"char",
		"class",
		"const",
		"continue",
		"default",
		"do",
		"double",
		"else",
		"enum",
		"extends",
		"final",
		"finally",
		"float",
		"for",
		"goto",
		"if",
		"implements",
		"import",
		"instanceof",
		"int",
		"interface",
		"long",
		"native",
		"new",
		"package",
		"private",
		"protected",
		"public",
		"return",
		"short",
		"static",
		"strictfp",
		"super",
		"switch",
		"synchronized",
		"this",
		"throw",
		"throws",
		"transient",
		"try",
		"void",
		"volatile",
		"while"
		};

	// classes can have a constructor method
	public NetworkSecurity() {
	
	}

	// classes can have another constructor method with a signature
	public NetworkSecurity(String clsname) {
		this.className = clsname;
	}
	

	public String summerAbduction() {
		return this.keyWordList[4];
	}
	
}