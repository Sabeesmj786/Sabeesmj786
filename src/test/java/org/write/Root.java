package org.write;

import java.util.ArrayList;

public class Root {
	
	private int id;
	
	private String type;
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getPpu() {
		return ppu;
	}



	public void setPpu(double ppu) {
		this.ppu = ppu;
	}



	public Batters getBatters() {
		return batters;
	}



	public void setBatters(Batters batters) {
		this.batters = batters;
	}



	public ArrayList<Object> getTopping() {
		return topping;
	}



	public void setTopping(ArrayList<Object> topping) {
		this.topping = topping;
	}



	private String name;
	
	private double ppu;
	
	private Batters batters;
	
	

	private ArrayList<Object> topping;
	

}
