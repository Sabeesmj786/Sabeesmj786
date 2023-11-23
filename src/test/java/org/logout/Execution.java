package org.logout;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Execution {
	
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		File file = new File("C:\\Users\\msabe\\eclipse-workspace\\Encapsulation\\src\\test\\resources\\Sample.json");
		
		Root r = new Root();
		r.setName("sabee");
		r.setAge(26);
		r.setStatus(true);
		
		Address a = new Address();
		a.setCity("kumbakonam");
		a.setState("Tamil Nadu");
		a.setCountry("India");
		
		r.setAddress(a);
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Java");
		al.add("Selenium");
		al.add("python");
		
		r.setCourses(al);
		
		ObjectMapper object = new ObjectMapper();
		object.writeValue(file, r);
		 
		

	}

}
