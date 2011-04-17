import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

public class login extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://webtesting.idyll.org/");
		selenium.start();
	}

	@Test
	public void testLogin() throws Exception {
		selenium.open("/");
		selenium.click("link=Log in");
		selenium.waitForPageToLoad("30000");
		selenium.click("create");
		selenium.waitForPageToLoad("30000");
		selenium.type("name", "Bob");
		selenium.select("gender", "label=female");
		selenium.type("username", "bobthetranny");
		selenium.type("password", "bobthetranny");
		selenium.click("create");
		selenium.waitForPageToLoad("30000");
		selenium.type("username", "bobthetranny");
		selenium.type("password", "bobthetranny");
		selenium.click("login");
		selenium.waitForPageToLoad("30000");
		verifyTrue(selenium.isTextPresent("Welcome, bobthetranny"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
