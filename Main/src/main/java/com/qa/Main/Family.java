package com.qa.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Family {
	List <People> person = new ArrayList<People>();
	
	public boolean male(String name) {
		if(ishere(name)) {
			People checkPerson = getPerson(name);
			
			if(checkPerson.getGender().equals("None")) {
				checkPerson.setGender("Male");
				return true;
			}
			else {
				return false;
			}
		} 
		else {
			person.add(new People(name));
			People newPerson = getPerson(name);
			newPerson.setGender("Male");
			return true;
		}
	}
	
	
	
	
	public boolean ishere(String name) {
		boolean ishe = person.stream().anyMatch(x -> x.getName().equals(name));
		return ishe;
	}
	
	public People getPerson(String name) {
		List<People> person2 = person.stream().filter(x -> x.getName().equals(name)).collect(Collectors.toList());
		return person2.get(0);
	}
}
