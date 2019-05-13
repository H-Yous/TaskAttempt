package com.qa.Main;

import org.junit.Test;

import junit.framework.TestCase;

public class TestClass extends TestCase {
	
	Family fam = new Family();
	@Test
	public void testMale() {
		assertTrue(fam.male("Dylan"));
	}
	
	public void testMaleIfAssigned() {
		fam.male("Dylan");
		assertFalse(fam.male("Dylan"));
	}
	
	public void testMaleOfMadePerson() {
		fam.person.add(new People("Dylan"));
		fam.person.get(0).setGender("Male");
		assertFalse(fam.male("Dylan"));
	}
	
	public void testFemale() {
		assertTrue(fam.female("Naomi"));
	}
	
	public void testFemaleIfAssigned() {
		fam.female("Naomi");
		assertFalse(fam.female("Naomi"));
	}
	
	public void testFemaleOfMadePerson() {
		fam.person.add(new People("Naomi"));
		fam.person.get(0).setGender("Female");
		assertFalse(fam.female("Naomi"));
	}
	
//	public void testMaleWhenSpouseMale() {
//		
//	}
	
}
