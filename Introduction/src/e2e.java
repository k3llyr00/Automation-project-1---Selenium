import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		//Declaring variables
		int adultPassengers = 3;

		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//From
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);

		//To
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();

		
		// Depart date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		//Return date should be disabled
		Assert.assertTrue(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"));
		
		//Passengers
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		for (int i = 1; i < adultPassengers ; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//Currency
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3); //Select the option 'USD'.
		
		//Discount
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		//Click on the search button
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		//Quit the browser
		driver.quit();
		
		
	}

}
