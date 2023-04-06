package br.com.task.domain;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course courseOne = new Course();
		courseOne.setTitle("Java");
		courseOne.setDescription("Doing course Java");
		courseOne.setWorkload(120);
		
   		Course courseTwo = new Course();
		courseTwo.setTitle("JavaScript");
		courseTwo.setDescription("Doing course JavaScript");
		courseTwo.setWorkload(150);
        
		Mentoring mentoringOne = new Mentoring();
		mentoringOne.setTitle("Mentoring Java");
		mentoringOne.setDescription("Learning about Java");
		mentoringOne.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setName("Bootcamp Java Developer");		
	    bootcamp.setDescription("Bootcamp Java Developer 2023");
	    bootcamp.getContent().add(courseOne);
	    bootcamp.getContent().add(courseTwo);
	    bootcamp.getContent().add(mentoringOne);
	    
	    Dev devWeslley = new Dev();
	    devWeslley.setName("Weslley");
	    devWeslley.registerBootcamp(bootcamp);
	    System.out.println("Content doing "+devWeslley.getContentsDoing());
	    System.out.println("XP Weslley "+ devWeslley.calculateTotalXp());
        devWeslley.progress();
	    System.out.println("Content done "+devWeslley.getContentsDone());
	    System.out.println("XP Weslley "+ devWeslley.calculateTotalXp());
	    System.out.println("Content doing "+devWeslley.getContentsDoing());


        
	    Dev devLaisa = new Dev();
	    devLaisa.setName("Laisa");
	    System.out.println("Content doing "+devLaisa.getContentsDoing());
	    System.out.println("XP Laisa "+ devLaisa.calculateTotalXp());

	    devLaisa.registerBootcamp(bootcamp);
	    System.out.println("Content doing "+devWeslley.getContentsDoing());
	    System.out.println("Content doing "+devLaisa.getContentsDoing());
        
	    devLaisa.progress();
	    System.out.println("Content done "+devLaisa.getContentsDone());
	    
	   
	    System.out.println("Content doing "+devLaisa.getContentsDoing());
	    System.out.println("XP Laisa "+ devLaisa.calculateTotalXp());


       
	}	

}
