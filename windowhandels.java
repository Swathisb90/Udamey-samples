package alerts_iframes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class windowhandels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#/");
		driver.manage().window().minimize();
		String currentHandle= driver.getWindowHandle();
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		//switch with the help of actions class 
		Actions action = new Actions(driver); 
		action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform(); //opening the URL saved.
		
		driver.findElement(By.id("username")).sendKeys("ajhfgfhjgjhhsd");
	    driver.findElement(By.xpath("//a[contains(text(),'mentor@rahulshettyacademy.com')]")).getText();
		//System.out.println(email);
		
		//driver.switchTo().window(currentHandle);
		driver.findElement(By.id("username")).sendKeys("hjg");
		

	}

}
