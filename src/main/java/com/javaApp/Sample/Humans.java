package com.javaApp.Sample;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Humans {
	private int id;
	private String name;
	private int points;
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	@Override
	public String toString() {
		return "Humans [name=" + name + ", points=" + points + "]";
	}
	
	 
}
