package org.login;

import java.io.IOException;

import org.base.BaseClass;

public class HDFCPojo extends BaseClass {
	
	private int customerId;
	private String password;
	
	public void setCustomerId(int customerId) {

		if(customerId==123) {
			this.customerId=1;
		}
		else if (customerId==321) {
			this.customerId=1;
		}
		else if (customerId==231) {
			this.customerId=1;
		}
		else {
			this.customerId=0;
		}
}
	public void setPassword(String password) {
		
		if (password.equals("abc")&& customerId==1) {
			this.password="valid password of Ridhan";
			
		}else if (password.equals("cba")&& customerId==1) {
			this.password="valid password of Sri";
			
		} else if (password.equals("bac")&& customerId==1) {
			this.password="valid password of Nila";
		}
		else {
			this.password="Invalid Account";
		}
	
	}
	public int getCustomerId() throws IOException {
		if (password.equals("valid password of Ridhan")) {
			String readFromExcel = readFromExcel(1,3);
			int parseInt = Integer.parseInt(readFromExcel);
			return parseInt;
			
		}else if(password.equals("valid password of Sri")) {
			String readFromExcel = readFromExcel(2,3);
			int parseInt = Integer.parseInt(readFromExcel);
			return parseInt;
			
		}else if(password.equals("valid password of Nila")) {
			String readFromExcel = readFromExcel(2,3);
			int parseInt = Integer.parseInt(readFromExcel);
			return parseInt; 
			
		}else {
			return 0;
		}
	}
	public String getPassword() {
	return "Thanks for Using HDFC";
	}
}