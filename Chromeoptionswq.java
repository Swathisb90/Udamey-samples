package alerts_iframes;

import org.openqa.selenium.chrome.ChromeDriver;

import ChromeOptions.ChromeOptions;

public class Chromeoptionswq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");

	}

}
