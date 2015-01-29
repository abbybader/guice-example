package project;

public class ProjectContactService {
	
	public int getNumberOfContactsWithClient(String projectName) {
		Project project = ProjectFactory.getProject(projectName);
		return project.getNumClientContacts();
	}
	
	public void logClientContact(String projectName) {
		Project project = ProjectFactory.getProject(projectName);
		project.logClientContact();
	}

}
