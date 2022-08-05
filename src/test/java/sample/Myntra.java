package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {
	WebDriver driver;
	SoftAssert s=new SoftAssert();
	  @BeforeClass(groups={"regression"})
     public void openBrowser() {

   	  WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
           driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

     }
	 @DataProvider
	  public Object[][] dp() {
	    return new Object[][] {{ "puma", "Puma - Buy Orignal Puma products in India | Myntra" },{"nike","Nike - Shop for Nike Apparels Online in India | Myntra"},{"Woodland","Woodland - Buy from Woodland Online Store in India | Myntra"}};
	    }
	    @Test(dataProvider = "dp",groups={"regression"})
	    public void search(String value,String expected)
	    {
	    	driver.get("https://www.myntra.com/");
	    	driver.findElement(By.xpath("//*[@id='desktop-header-cnt']/div[2]/div[3]/input")).sendKeys(value);
	    	driver.findElement(By.xpath("//*[@id='desktop-header-cnt']/div[2]/div[3]/a")).click();
	    //	Assert.assertEquals(driver.getTitle(), expected);
	    	s.assertEquals(driver.getTitle(), expected);

	    	System.out.println("good morning");
	    
	    	
	    	
	    }
}
