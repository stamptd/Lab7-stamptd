import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

public class schedulelookup extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://www.rose-hulman.edu/");
		selenium.start();
	}

	@Test
	public void testSchedulelookup() throws Exception {
		selenium.open("/");
		selenium.click("link=Current Students");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=div.dailytools > table > tbody > tr > td > a:nth(1)");
		selenium.waitForPageToLoad("30000");
		selenium.type("UserID", "stamptd");
		selenium.type("css=input[name=PIN]", "lol,no");
		selenium.click("css=p > input[type=submit]");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=table.menuplaintable > tbody > tr:nth(1) > td.mpdefault > a.submenulinktext2");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Schedule Lookup Page (NOT Live Data)");
		selenium.waitForPageToLoad("30000");
		selenium.type("id1", "stamptd");
		selenium.click("bt1");
		selenium.waitForPageToLoad("30000");
		verifyTrue(selenium.isTextPresent("CSSE376-01	3412	Software Quality Assurance	mohan"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
