package ibm.network.security;

public class NetworkSecurity {
	private String key;
	private boolean foundMatch;
	
	private String[] keyWordList = {
			"abstract",
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
	
	public NetworkSecurity(String cname, boolean foundm) {
		this.key = cname;
		this.foundMatch = foundm;
	}

	public NetworkSecurity() {
		// TODO Auto-generated constructor stub
	}
	
	public String getKeyWordFromList() {
		  
		return " popped a key from the list:> " + this.key;
		
	}
	
	
	public void setKey(String name) {
		this.key = name;
	}
	
	public String getKey() {
		return this.key;
	}

	public boolean getMatchFound(String word) {
		for (String item : keyWordList) {
			// if key in list, set it for the key
			if (word == item) {
				this.foundMatch = true;
				setKey(word);
			}
		}
		return this.foundMatch;
	}
}
