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
	

	
//	public void testMaleWhenSpouseMale() {
//		
//	}
	
}
