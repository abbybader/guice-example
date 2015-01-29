package project;

import java.util.Map;

/**
 * Static lazy-initializing of Project objects to enforce singleton-ness
 * 
 */
public class ProjectFactory {

	private static Map<String, Project> PROJECT_MAP = null;

	public static Project getProject(String name) {
		if (PROJECT_MAP == null) {
			PROJECT_MAP = ProjectReader.readProjects();
		}
		return PROJECT_MAP.get(name);
	}

}
