import org.junit.Test;


public class SmokeTest extends BaseTest
{
 HomePage hp;
 @Test
 public void linktest()
 {
	 hp= new HomePage(dr).get();
	 hp.clickPage();
 }
 
 
 
}
