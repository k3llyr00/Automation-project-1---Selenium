import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		
		// Solution 1: without index [2] Selenium can't find the element, 
		//because there's 2 matching elements and the first one is closed (because departure drop-down is closed
		
		//therefore, hard coding indexes are not always preferred solution.
		
		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		//Solution 2: //parent //child xpath following each other
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

	}

}
