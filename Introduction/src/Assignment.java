import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		//Declare variables
		String text = "Kelly";
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).sendKeys(text);
		
		//Click on Alert
		driver.findElement(By.id("alertbtn")).click();
		
		//Access to JavaScript pop-ups
		Assert.assertEquals(driver.switchTo().alert().getText(), "Hello " + text + ", share this practice page and share your knowledge"); 
		
		//Click on positive scope (Yes, Accept, Confirm etc)
		driver.switchTo().alert().accept();
		
		
		// ** Second alert **
		Thread.sleep(5000);
		
		driver.findElement(By.id("name")).sendKeys(text);
		
		//Click on Confirm
		driver.findElement(By.id("confirmbtn")).click();
		
		Assert.assertEquals(driver.switchTo().alert().getText(), "Hello " + text + ", Are you sure you want to confirm?"); 
		
		// Click the Cancel/No (negative scope) button
		driver.switchTo().alert().dismiss();
		
		driver.quit();
	}

}
