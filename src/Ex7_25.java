
public class Ex7_25 {
	public static void main(String[] args) {
		 Parseable parser = ParserManager.getParser("XML");
		 parser.parse("document.xml");
		 parser = ParserManager.getParser(".");
		 parser.parse("documnet2.html");
		 
		
	}
}

interface Parseable {
	public abstract void parse(String fileName);
}

class ParserManager {
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser();
		} else {
			Parseable p = new HTMLParse();
			return p;
		}
	}
}

class XMLParser implements Parseable {
	public void parse(String fileName) {
		System.out.println(fileName + " - XML parsing completed");
	}
}

class HTMLParse implements Parseable {
	public void parse(String fileName) {
		System.out.println(fileName +" - HTML parsing completed");
	}
}