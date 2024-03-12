package Selenium_Demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium_intro {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
		// invoking Browser
		//chrome-chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMILINDP\\Documents\\Java_selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
	}

}
