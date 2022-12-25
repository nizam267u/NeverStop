package never.us.hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import never.us.base.BasePage;

public class Hooks extends BasePage {
	
	@Before
	public void setUp() {
		log.info("Opening the browser....");
		BasePage.initialization();
		
	}
	
	@After
	public void tearDown() {
		log.info("Closing the browser....");
		//driver.quit();
	}
	
}
