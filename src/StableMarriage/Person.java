package StableMarriage;

import java.util.ArrayList;

public class Person {
	
	private String name;
	private ArrayList<String> priorities = new ArrayList<String>();
	public String partner = null;
	
	public Person(String name, ArrayList<String> priorities) {
		this.name  = name;
		this.setPriorities(priorities);
	}
	
	public ArrayList<String> getPriorities() {
		return priorities;
	}

	public void setPriorities(ArrayList<String> priorities) {
		this.priorities = priorities;
	}

}
