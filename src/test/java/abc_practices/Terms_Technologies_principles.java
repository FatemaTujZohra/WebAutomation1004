package abc_practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Terms_Technologies_principles {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Terms")).click();
        Thread.sleep(4000);
        driver.findElement(By.linkText("Technologies and Principles")).click();
        Thread.sleep(4000);
        driver.findElement(By.linkText("Advertising")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("How Google uses cookies")).click();
        
        

	}

}
