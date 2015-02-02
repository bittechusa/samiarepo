import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;


public class SeleniumHistory {

	public static void main(String[] args) {
		{
			//WebDriver way to open browser
			//FirefoxDriver driver = new FirefoxDriver();
			
			//Selenium Remote Control way (RC)
			
			/*DefaultSelenium driver = new DefaultSelenium ("localhost", 4444,"*googlechrome", "http://www.bittechusa.com");
				driver.start();
			    driver.open("/reg.html");
			    driver.type("name", "Samia");
			    */
				
			FirefoxDriver webDriver = new FirefoxDriver();
			WebDriverBackedSelenium rc = new WebDriverBackedSelenium(webDriver, "http://www.bittechusa.com/site1.html");
			webDriver.get("http://www.bittechusa.com/site1.html");
			rc.type("name", "Samia");
			rc.type("email", "samirdu20@gmail.com");
			//webDriver.findElement(By.name("email")).sendkeys("samirdu20@gmail.com");
			rc.type("class=contact", "90070707");
			rc.click("F");
		}

	}

}
