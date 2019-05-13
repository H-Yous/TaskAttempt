package com.qa.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Family {
	List<People> person = new ArrayList<People>();

	public boolean male(String name) {
		if (ishere(name)) {
			People checkPerson = getPerson(name);
			if (checkMaleSpouse(name)) {
				return false;
			} else if (checkPerson.getGender().equals("None")) {
				checkPerson.setGender("Male");
				return true;
			} else {
				return false;
			}
		} else {
			person.add(new People(name));
			People newPerson = getPerson(name);
			newPerson.setGender("Male");
			return true;
		}
	}

	public boolean female(String name) {
		if (ishere(name)) {
			People checkPerson = getPerson(name);

			if (checkFemaleSpouse(name)) {
				return false;
			} else if (checkPerson.getGender().equals("None")) {
				checkPerson.setGender("Female");
				return true;
			} else {
				return false;
			}
		} else {
			person.add(new People(name));
			People newPerson = getPerson(name);
			newPerson.setGender("Female");
			return true;
		}
	}

	public boolean isMale(String name) {

		if (ishere(name)) {
			People person2 = getPerson(name);

			if (person2.getGender().equals("Male")) {
				return true;
			} else {
				return false;
			}
		} else {
			person.add(new People(name));
			return false;
		}

	}

	public boolean isFemale(String name) {
		if (ishere(name)) {
			People person2 = getPerson(name);

			if (person2.getGender().equals("Female")) {
				return true;
			} else {
				return false;
			}
		} else {
			person.add(new People(name));
			return false;
		}
	}

	public Boolean setParentOf(String childName, String parentName) {
		if (ishere(parentName)) {
			People parent = getPerson(parentName);
			

			if (ishere(childName)) {
				People child = getPerson(childName);

				if (isChild(parentName, childName)) {
					return false;
				} else {
					if (child.getParentList().get().size() == 0) {
						child.getParentList().get().add(parent);
						parent.getChildList().get().add(child);
						return true;
					} else if (child.getParentList().get().size() == 1) {
						if (child.getParentList().get().get(0).getGender().equals("None")) {

							child.getParentList().get().add(parent);
							parent.getChildList().get().add(child);

							child.getParentList().get().get(0).getSpouseList().get().add(parent);
							parent.getSpouseList().get().add(child.getParentList().get().get(0));
							return true;
						} else if (!child.getParentList().get().get(0).getGender().equals(parent.getGender())) {
							child.getParentList().get().add(parent);
							parent.getChildList().get().add(child);

							child.getParentList().get().get(0).getSpouseList().get().add(parent);
							parent.getSpouseList().get().add(child.getParentList().get().get(0));
							return true;
						}
						else {
							return false;
						}
					} else {return false;}
				}
			} else {person.add(new People(childName));
			People child = getPerson(childName);
			parent.getChildList().get().add(child);
			child.getParentList().get().add(parent);

			return true;
			}
		}
		else {
			person.add(new People(parentName));
			People parent = getPerson(parentName);
			
			if (ishere(childName)) {
				People child = getPerson(childName);

				if (isChild(parentName, childName)) {
					return false;
				} else {
					if (child.getParentList().get().size() == 0) {
						child.getParentList().get().add(parent);
						parent.getChildList().get().add(child);
						return true;
					} else if (child.getParentList().get().size() == 1) {
						if (child.getParentList().get().get(0).getGender().equals("None")) {

							child.getParentList().get().add(parent);
							parent.getChildList().get().add(child);

							child.getParentList().get().get(0).getSpouseList().get().add(parent);
							parent.getSpouseList().get().add(child.getParentList().get().get(0));
							return true;
						} else if (!child.getParentList().get().get(0).getGender().equals(parent.getGender())) {
							child.getParentList().get().add(parent);
							parent.getChildList().get().add(child);

							child.getParentList().get().get(0).getSpouseList().get().add(parent);
							parent.getSpouseList().get().add(child.getParentList().get().get(0));
							return true;
						}
						else {
							return false;
						}
					} else {return false;}
				}
			} else {person.add(new People(childName));
			People child = getPerson(childName);
			parent.getChildList().get().add(child);
			child.getParentList().get().add(parent);

			return true;
			}
		}
	}
	
	
	public String[] getParentsOf(String name) {
		String[] parents = new String[2];
		if(ishere(name)) {
			People child = getPerson(name);
			List <People> parentList = child.getParentList().get();
			
			List<String> names = parentList.stream()
					.map(x -> x.getName())
					.sorted()
					.collect(Collectors.toList());
			
			parents = names.stream().toArray(String[]::new);
			
			return parents;
		} else {
			person.add(new People(name));
			return parents;
		}
	}

	
	public String[] getChildrenOf(String name) {
		if(ishere(name)) {
			People parent = getPerson(name);
			String[] children = new String[parent.getChildList().get().size()];

			List <String> names = parent.getChildList().get().stream().map(x -> x.getName()).sorted().collect(Collectors.toList());
			children = names.stream().toArray(String[]::new);


			return children;
		}
		else {
			People parent = getPerson(name);
			String[] children = new String[parent.getChildList().get().size()];
			
			return children;
		}
	}
	
	
	
	
	

	public Boolean isChild(String childName, String parentName) {
		People parent = getPerson(parentName);

		boolean ishe = parent.getChildList().get().stream().anyMatch(x -> x.getName().equals(childName));
		return ishe;
	}

	public boolean ishere(String name) {
		boolean ishe = person.stream().anyMatch(x -> x.getName().equals(name));
		return ishe;
	}

	public People getPerson(String name) {
		List<People> person2 = person.stream().filter(x -> x.getName().equals(name)).collect(Collectors.toList());
		return person2.get(0);
	}

	public Boolean checkMaleSpouse(String name) {
		People checkP = getPerson(name);
		if (checkP.getSpouseList().get().size() > 0) {
			if (isMale(checkP.getSpouseList().get().get(0).getName())) {
				return true;
			} else
				return false;
		} else
			return false;
	}

	public Boolean checkFemaleSpouse(String name) {
		People checkP = getPerson(name);
		if (checkP.getSpouseList().get().size() > 0) {
			if (isFemale(checkP.getSpouseList().get().get(0).getName())) {
				return true;
			} else
				return false;
		} else
			return false;
	}
}
