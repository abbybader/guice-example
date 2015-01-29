package simple;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SandboxTest {
	
	@Test
	public void testDefaultBehavior() {
		Sandbox sandbox = new Sandbox();
		Object result = sandbox.doSomeStuff();
		Assert.assertEquals(ArrayList.class, result.getClass());
		Assert.assertEquals(4, ( (List) result).size());
	}
	
	@Test
	public void testNonMagicNumber() {
		// ??
	}
	

}
