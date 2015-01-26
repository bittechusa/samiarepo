import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;


public class HomePage extends LoadableComponent<HomePage>
{
 FirefoxDriver dr;
 @FindBy (how = How.XPATH, using = "html/body/div[4]/header/section[3]/div/nav/ul/li[3]/a/b")
 WebElement theClickElectro;
 
 public HomePage(FirefoxDriver dr)
 {
	 this.dr = dr;
	 PageFactory.initElements(dr, this);
 }
 public ElectroPage clickPage()
 {
	 theClickElectro.click();
	 return new ElectroPage(dr);
 }

@Override
protected void isLoaded() throws Error {
	Assert.assertTrue(dr.getCurrentUrl().contains("Eshop"));
	System.out.println("hi");
	
}

@Override
protected void load() {
	dr.get("www.eshopper24.com");
	
}
 
 
}
