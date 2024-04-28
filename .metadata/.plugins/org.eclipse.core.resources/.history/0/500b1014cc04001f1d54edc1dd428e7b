import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;


public class Locators2 {
	
	public static void main(String[] args) throws InterruptedException {
		//declaring variables
		String username = "k3llyr00@gmail.com";
		
		WebDriver driver = new EdgeDriver();
		//when something is not showing up in page, wait 5 seconds before failing
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(username);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.className("signInBtn")).click();
		
		//Regarding the fact that the webpage is one-pager, the correct tag is not visible yet. Thus implicitlyWait is not the solution.
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " + username + ",");
		
		//identify button based on the text, case-sensitive - choose text in html code not the one you see in UI. 
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
	}
	
	// argument is driver, because otherwise it's out of scope
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		String[] passwordArray = passwordText.split("'");
		//0th index - Please use temporary password
		//1th index - rahulshettyacademy' to Login.
		String password = passwordArray[1].split("'")[0];
		//0th index - rahulshettyacademy
		//1th index -  to Login
		return password;
	}

}
