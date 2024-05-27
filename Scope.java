package alerts_iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Program to understand the scope of webelements in sections
		// 1. code which fetches the total count of all the links present in the website
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);


		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int count = driver.findElements(By.tagName("a")).size();
		System.out.println(count);
		
		//2. Fetches the total count of all the links present in the footer section only
		WebElement footer = driver.findElement(By.cssSelector("div[class=' footer_top_agile_w3ls gffoot footer_style']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		//3. Fetches the total count of all the links present in the footer section of Discount coupon section
		WebElement columndriver = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//4. Click on all the links present in the footer section of Discount coupons
		
		for(int i=1; i<columndriver.findElements(By.tagName("a")).size(); i++ ) {
			
			 //String clickontabs=Keys.chord(Keys.CONTROL,Keys.ENTER);
			 columndriver.findElements(By.tagName("a")).get(i).sendKeys(Keys.ENTER);
			 Thread.sleep(2000);
			 
		}
        
	}

}
