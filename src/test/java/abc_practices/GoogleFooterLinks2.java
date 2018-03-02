package abc_practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class GoogleFooterLinks2 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Privacy")).click();

		Thread.sleep(2000);
		Assert.assertEquals(true, driver.getPageSource().contains("Privacyuu"));
		//Thread.sleep(2000);
		//driver.close();

		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Terms")).click();

		Thread.sleep(2000);
		Assert.assertEquals(true, driver.getPageSource().contains("Terms"));
		Thread.sleep(2000);
		//driver.close();

		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Settings")).click();

		Thread.sleep(1000);
		Assert.assertEquals(true, driver.getPageSource().contains("Settings"));
		Thread.sleep(1000);
		driver.close();

	}

}
