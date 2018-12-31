package com.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("aObj")
public class Address {
	
	@Value("123")
	private int addrId;
	@Value("AAAA")
	private String loc;
	@Value("#{eObj}")
	private Employee emp;
	
	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", loc=" + loc + ", emp=" + emp + "]";
	}
	
	
}
