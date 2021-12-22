package dataDrivenTesting;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class Json {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		FileReader fr= new FileReader("./jsonfile.json");
		JSONParser JP = new JSONParser();
		Object parsedfile = JP.parse(fr);
		HashMap Map = (HashMap)parsedfile;
		System.out.println(Map.get("Username"));
		System.out.println(Map.get("Password"));
		

	}

}
