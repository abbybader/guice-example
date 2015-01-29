package project;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class ProjectReader {

	public static String PROJECT_DESCRIPTION_FILE = "src/main/resources/projects.json";

	public static Map<String, Project> readProjects() {

		Map<String, Project> result = new HashMap<String, Project>();
		try {
			JSONObject projectJson = new JSONObject(
					FileUtils.readFileToString(new File(
							PROJECT_DESCRIPTION_FILE)));
			for (Iterator<String> iterator = projectJson.keys(); iterator
					.hasNext();) {
				String key = iterator.next();
				JSONObject project = projectJson.getJSONObject(key);
				result.put(key, new Project(project.getString("name")));
			}
		} catch (JSONException e) {
			System.out.println("Problem with parsing projects file contents");
		} catch (IOException e) {
			System.out.println("Problem with reading projects file");
		}
		return result;
	}

}
