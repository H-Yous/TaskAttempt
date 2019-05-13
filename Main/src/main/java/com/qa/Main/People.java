package com.qa.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class People {
	private String name, gender;
	
	private List <People> spouse = new ArrayList<People>();
	private List <People> parentsList = new ArrayList<People>();
	private List <People> childList = new ArrayList<People>();
	
	public People() {
		
	}
	public People(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender() {
		return Optional.of(this.gender).orElse("None");
	}
	
	public void addSpouse(People spouse) {
		this.spouse.add(spouse);
	}
	public Optional<List<People>> getSpouseList() {
		return Optional.of(this.spouse);
	}
	
	public void addParent(People parent) {
		this.parentsList.add(parent);
	}
	public Optional<List<People>> getParentList() {
		return Optional.of(parentsList);
	}
	
	public void addChild(People child) {
		this.childList.add(child);
	}
	public Optional<List<People>> getChildList() {
		return Optional.of(childList);
	}
	
	
	
}
