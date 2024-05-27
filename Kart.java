package E2E;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Kart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //https://rahulshettyacademy.com/seleniumPractise/#/offers
		
		String monthNumber= "6";
		String Day = "15";
		String Year = "2024";
		
		String[] expectedList = {monthNumber, Day, Year};
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();

		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();

		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();

		driver.findElement(By.xpath("//button[text()='"+Year+"']")).click();

		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthNumber)-1).click();

		driver.findElement(By.xpath("//abbr[text()='"+Day+"']")).click();

		List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));

		for(int i =0; i<actualList.size();i++)

		{

		System.out.println(actualList.get(i).getAttribute("value"));

		Assert.assertEquals(actualList.get(i).getAttribute("value"), expectedList[i]);

		}

		driver.close();


		
		
	}

}
