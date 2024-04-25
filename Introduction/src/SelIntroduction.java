import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction implements WebDriver{

	public static void main(String[] args) {
		/*
		Invoking the Browser
		manually set the path for chromedriver.exe,
		if this is not done, Selenium Manager does it automatically 
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\chromedriver.exe");
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		//Print the URL you're landing on to the console.
		System.out.println(driver.getCurrentUrl());
		// Print the title of the page to the console.
		System.out.println(driver.getTitle());
		
		/* quit() - This method terminates the entire WebDriver session.
		It closes all browser windows associated with the session.

		close () - This method closes only the current browser window or tab.
		It keeps the WebDriver session active if other windows are still open.
 		*/
		
 		driver.close();
 		
 		
 		//Edge
 		//System.setProperty("webdriver.edge.driver", "C:\\Program Files\\Google\\Chrome\\msedgedriver.exe");
 		WebDriver driver1 = new EdgeDriver();
		driver1.get("https://rahulshettyacademy.com/");
		System.out.println(driver1.getCurrentUrl());
		System.out.println(driver1.getTitle());
 		driver1.close();
 		
 		
 		//FireFox
 		//System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Google\\Chrome\\geckodriver.exe");
 		WebDriver driver2 = new FirefoxDriver();
		driver2.get("https://rahulshettyacademy.com/");
		System.out.println(driver2.getCurrentUrl());
		System.out.println(driver2.getTitle());
 		driver2.close();

	}

}
