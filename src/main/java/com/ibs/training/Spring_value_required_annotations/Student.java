package com.ibs.training.Spring_value_required_annotations;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("${student.name}")
	private String name;
	@Value("${student.courseName}")
	private String courseName;
	@Value("${student.hobby}")
	private String hobby;
	public String getName() {
		return name;
	}
	
	
	public void showDetailsInfo(){
		System.out.println("Name of Student: "+ name);
		System.out.println("Course taken: "+ courseName);
		System.out.println("Hobby is: "+hobby);
	}
	

}
