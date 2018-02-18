package abc_practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

//import junit.framework.Assert;

public class GoogleFooterLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		GoogleFooterLinks G =new GoogleFooterLinks();
		G.clickprivacy(driver);
	    G.clickterms(driver);
		G.clicksettings(driver);

// Here I used separate methods with argument stated in main() for each of the three tests.
// Then I called the methods from main method for execution. I also did another way by putting all three
//in main method shown in separate class of this package.
	}
	void  clickprivacy(WebDriver driver) throws InterruptedException 
	{
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Privacy")).click();

		Thread.sleep(2000);
		Assert.assertEquals(true, driver.getPageSource().contains("Privacy"));
		//driver.close();



	}

	void clickterms (WebDriver driver) throws InterruptedException {
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Terms")).click();

		Thread.sleep(1000);
		Assert.assertEquals(true, driver.getPageSource().contains("Terms"));
		//driver.close();


	}

	void clicksettings (WebDriver driver) throws InterruptedException 
	{
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Settings")).click();

		Thread.sleep(1000);
		Assert.assertEquals(true, driver.getPageSource().contains("Settings"));
		Thread.sleep(1000);
		driver.close();


	}




}












