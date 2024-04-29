import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		//Declaring variables
		int adultPassengers = 5;
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); // Value of adult passengers before the loop
		
		// click 4 times '+'-button
		for (int i = 1; i < adultPassengers; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); // Value of adult passengers after the loop
		
	}

}