package br.com.task.domain;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course courseOne = new Course();
		courseOne.setTitle("Java");
		courseOne.setDescription("Doing course Java");
		courseOne.setWorkload(120);
        
		System.out.println(courseOne);
		Course courseTwo = new Course();
		courseTwo.setTitle("JavaScript");
		courseTwo.setDescription("Doing course JavaScript");
		courseTwo.setWorkload(150);
        
		System.out.println(courseTwo);
		Mentoring mentoringOne = new Mentoring();
		mentoringOne.setTitle("Mentoring Java");
		mentoringOne.setDescription("Learning about Java");
		mentoringOne.setData(LocalDate.now());
		System.out.println(mentoringOne);
	}	

}
