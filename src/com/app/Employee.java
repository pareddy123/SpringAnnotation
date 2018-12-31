package com.app;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eObj")
public class Employee {
	
	@Value("111")
	private int empId;
	@Value("Dinesh")
	private String empName;
	@Value("13.34")
	private double empSal;
	
	@Value("#{lstObj}")
	private List<String> list;
	@Value("#{sObj}")
	private Set<String> set;
	@Value("#{mObj}")
	private Map<String, Integer> map;
	@Value("#{pObj}")
	private Properties properties;
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", list=" + list + ", set="
				+ set + ", map=" + map + ", properties=" + properties + "]";
	}
	
	
}
