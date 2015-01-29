package simple;

import java.util.Map;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class SandboxModule extends AbstractModule {

	@Override
	protected void configure() {
		
	}
	
	@Provides
	public Map<String, String> getNamesMap() {
		return null;
	}

}
