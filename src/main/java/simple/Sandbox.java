package simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sandbox {
	
	private Map<String, String> firstNameLastNameMap;
	
	public Sandbox() {
		firstNameLastNameMap = new HashMap<String, String>();
		firstNameLastNameMap.put("Abby", "Bullock");
		firstNameLastNameMap.put("Regan", "Dwyer");
		firstNameLastNameMap.put("Carla", "Thompson");
	}
	
	public Object doSomeStuff() {
		List<String> lastNames = getLastNames(firstNameLastNameMap);
		if (lastNames.size() == 3) {
			lastNames.add("Three's the magic number");
		}
		return lastNames;
	}

	private List<String> getLastNames(Map<String, String> namesMap) {
		return new ArrayList<String>(namesMap.values());
	}
	
	
	
	public static void main(String[] args) {
		
		Sandbox sandbox = new Sandbox();
		List<String> lastNames = (List<String>) sandbox.doSomeStuff();
		System.out.print(lastNames);
	}

}
