package stepsDefinitions;

import static utils.Utils.acessarKeep;
import static utils.Utils.driver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void setUp() {
		acessarKeep();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
