package fileutilitytest;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Jsonpropertyfile {
	public String readData(String key) throws IOException, ParseException {
	
	FileReader fr = new FileReader(paths.jsonpath);
	JSONParser jp = new JSONParser();
	Object ob =jp.parse(fr);
	HashMap map = (HashMap) ob;
	String value = map.get(key).toString();
	return value;
	}

}
