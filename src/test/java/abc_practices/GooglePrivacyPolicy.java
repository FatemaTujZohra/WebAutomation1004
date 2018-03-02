package abc_practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GooglePrivacyPolicy {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Privacy")).click();
        Thread.sleep(4000);
        driver.findElement(By.linkText("Information we collect")).click();
        //driver.findElement(By.cssSelector("a[data-g-label='Information we collect']")).click();
        Thread.sleep(4000);
        
        //driver.findElement(By.cssSelector("a[data-g-label='How we use information we collect']")).click();
        
        
        
    }
	}


//<a class="gweb-smoothscroll-control" href="#infocollect" data-g-event="Maia: Site Nav" data-g-action="Maia: Level 2" 
//data-g-label="Information we collect">
//Information we collect</a>