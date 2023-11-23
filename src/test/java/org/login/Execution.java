package org.login;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Execution {

	public static void main(String[] args) throws IOException {

		HDFCPojo h = new HDFCPojo();

		h.setCustomerId(123);
		h.setPassword("abc");

		HDFCPojo h1 = new HDFCPojo();

		h1.setCustomerId(321);
		h1.setPassword("cba");

		HDFCPojo h2 = new HDFCPojo();

		h2.setCustomerId(231);
		h2.setPassword("bac");

		
		List<HDFCPojo> li = new ArrayList<HDFCPojo>();
		
		li.add(h);
		li.add(h1);
		li.add(h2);

		System.out.println("===============userDefined List================");
		
		for (int i = 0; i < li.size(); i++) {
			int customerId = li.get(i).getCustomerId();
			System.out.println(customerId);	
		}
		
		Set<HDFCPojo> si =new HashSet<HDFCPojo>();
		
		si.add(h);
		si.add(h1);
		si.add(h2);
		
		System.out.println("=================userDefinedSet================");
		
		for (HDFCPojo s : si) {
			System.out.println(s.getCustomerId());
			}
	
		System.out.println("==================userDefinedMap=================");
		
		Map<Integer, HDFCPojo> mi = new HashMap();
		
		mi.put(10, h);
		mi.put(20, h1);
		mi.put(30, h2);
		
		Collection<HDFCPojo> values = mi.values();
		for (HDFCPojo v : values) {
			System.out.println(v.getCustomerId());
			
		}
		
}
}
