import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//TestNG testing framework will provide assertions.
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		//Declaring variables
		int adultPassengers = 5;
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click(); // partial id
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 6); //findElements in plural, otherwise its taking the first one and returning this
		
		//before Enabling the datepicker 
		Assert.assertTrue(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"));

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		//after Enabling the datepicker 
		Assert.assertTrue(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"));
		
		
		// alternative way, but I think the assertion above is better
		/*
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){ // scanning the whole String and looking for "1".
			System.out.println("The Return date datepicker is enabled");
			Assert.assertTrue(true);
		} else {
			System.out.println("The Return date datepicker is disabled");
			Assert.assertTrue(false);
		}
		
		 */
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "1 Adult");
		
		// click 4 times '+'-button
		// int i = 1, because the default value is 1.
		for (int i = 1; i < adultPassengers; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		
		driver.close();
		
	}

}
