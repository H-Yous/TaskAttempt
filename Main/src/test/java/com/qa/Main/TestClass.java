package com.qa.Main;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestClass {
	
	Family fam = new Family();
	
	@Test
	public void testMale() {
		assertTrue(fam.male("Dylan"));
	}
	
	@Test
	public void testMaleIfAssigned() {
		fam.male("Dylan");
		assertFalse(fam.male("Dylan"));
	}
	
	@Test
	public void testMaleOfMadePerson() {
		fam.person.add(new People("Dylan"));
		fam.person.get(0).setGender("Male");
		assertFalse(fam.male("Dylan"));
	}
	
	@Test
	public void testFemale() {
		assertTrue(fam.female("Naomi"));
	}
	
	@Test
	public void testFemaleIfAssigned() {
		fam.female("Naomi");
		assertFalse(fam.female("Naomi"));
	}
	
	@Test
	public void testFemaleOfMadePerson() {
		fam.person.add(new People("Naomi"));
		fam.person.get(0).setGender("Female");
		assertFalse(fam.female("Naomi"));
	}
	
	@Test
	public void testIfisMale() {
		fam.person.add(new People("Humza"));
		fam.person.get(0).setGender("Male");
		assertTrue(fam.isMale("Humza"));
	}
	
	@Test
	public void testIfisMaleAssigned() {
		fam.person.add(new People("Humza"));
		fam.person.get(0).setGender("Female");
		assertFalse(fam.isMale("Humza"));
	}
	
	@Test
	public void testIfisMaleNotAssigned() {
		assertFalse(fam.isMale("Humza"));
	}
	
	@Test
	public void testIfisFemale() {
		fam.person.add(new People("Naomi"));
		fam.person.get(0).setGender("Female");
		assertTrue(fam.isFemale("Naomi"));
	}
	
	@Test
	public void testIfisFemaleAssigned() {
		fam.person.add(new People("Naomi"));
		fam.person.get(0).setGender("Male");
		assertFalse(fam.isFemale("Naomi"));
	}
	
	@Test
	public void testIfisFemaleNotAssigned() {
		assertFalse(fam.isFemale("Naomi"));
	}
	
	@Test
	public void testSetParentsNoneExist() {
		assertTrue(fam.setParentOf("Humza", "Farhaan"));
	}
	
	@Test
	public void testSetParentChildExists() {
		fam.person.add(new People("Humza"));
		assertTrue(fam.setParentOf("Humza", "Farhaan"));
	}
	
	@Test
	public void testSetParentParentExists() {
		fam.person.add(new People("Farhaan"));
		assertTrue(fam.setParentOf("Humza", "Farhaan"));
	}
	
	@Test
	public void testSetParentBothExist() {
		fam.person.add(new People("Farhaan"));
		fam.person.add(new People("Humza"));
		assertTrue(fam.setParentOf("Humza", "Farhaan"));
	}
	
	@Test
	public void getParentsof() {
		fam.person.add(new People("Ali"));
		fam.person.add(new People("Dan"));
		fam.setParentOf("Ali", "Dan");
		fam.setParentOf("Ali", "Linda");
		fam.getParentsOf("Ali");
		assertEquals(fam.getParentsOf("Ali"), "Dan Linda");
		
	}
	
	@Test
	public void getChildrenOf() {
		
	}
	
	
//	public void testMaleWhenSpouseMale() {
//		
//	}
	
}
