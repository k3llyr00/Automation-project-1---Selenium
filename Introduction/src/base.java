import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class base {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		// Expected array
		String[] itemsNeeded = { "Cucumber", "Brocolli" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String productName = products.get(i).getText();
			String productNameList [] = productName.split(" ");
			
			// COnvert array into array list for access contains method
			List<String> itemsNeededList = Arrays.asList(itemsNeeded);

			// Check whether name you extracted is present in arrayList or not
			if (itemsNeededList.contains(productNameList[0])) {

				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			}
		}
		
		Thread.sleep(5000);
		driver.quit();
	}
}
