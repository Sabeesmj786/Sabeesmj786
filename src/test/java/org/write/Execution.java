package org.write;

import java.io.File;
import java.util.ArrayList;

public class Execution {
	

	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\msabe\\eclipse-workspace\\Encapsulation\\src\\test\\resources\\SampleWrite.json");
		
		Root r = new Root();
		r.setId(0001);
		r.setType("donut");
		r.setName("Cake");
		
		Batters b = new Batters();
		
		b.setBatters("batters");
		
		r.setBatters(b);
		
		ArrayList<Object> obj = new ArrayList<Object>();
		obj.add( "("id": "1001","type": "Regular")");
	
	}

}
