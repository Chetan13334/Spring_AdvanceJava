package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Marks {
	
	@Value("85")
	private String smarks;
	
	
	public Marks(String smarks) {
		super();
		this.smarks = smarks;
	}
	
	public Marks() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getSmarks() {
		return smarks;
	}
	public void setSmarks(String smarks) {
		this.smarks = smarks;
	}
	@Override
	public String toString() {
		return "Marks [smarks=" + smarks + "]";
	}
}
