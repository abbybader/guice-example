package project;

public class Project {
	
	private int contactCounter = 0;
	private final String name;
	
	public Project(String name) {
		this.name = name;
	}
	
	public void logClientContact() {
		contactCounter++;
	}
	
	public int getNumClientContacts() {
		return contactCounter;
	}

}
