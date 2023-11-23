package org.read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJson {
	public static void main(String[] args) throws IOException, ParseException {
	
		FileReader file = new FileReader("C:\\Users\\msabe\\eclipse-workspace\\Encapsulation\\src\\test\\resources\\JSONFile.json");
		
		JSONParser parser = new JSONParser();
		
		Object parse = parser.parse(file);
		
		JSONObject jsonObject = (JSONObject) parse;
		
		System.out.println(jsonObject.get("id"));
		System.out.println(jsonObject.get("type"));
		System.out.println(jsonObject.get("name"));
		System.out.println(jsonObject.get("ppu"));
		System.out.println(jsonObject.get("batters"));
		System.out.println(jsonObject.get("topping"));
	
		Object object = jsonObject.get("batters");
		
		JSONObject jsonObject1 = (JSONObject) object;
		System.out.println("BATTERS:- "+jsonObject1.get("batter"));
		
		
		Object object2 = jsonObject1.get("batter");
		JSONArray jsonArray = (JSONArray) object2;
		for (int i = 0; i < jsonArray.size(); i++) {
			System.out.println("BATTER:- "+jsonArray.get(i));
		}
		
		Object object3 = jsonObject.get("topping");
		JSONArray jsonArray2 =(JSONArray) object3;
		for (int i = 0; i < jsonArray2.size(); i++) {
			System.out.println("TOPPING:- "+jsonArray2.get(i));
		}
		
		
	
	
	}
}
