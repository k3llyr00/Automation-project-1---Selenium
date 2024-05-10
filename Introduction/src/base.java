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
			String [] productName = products.get(i).getText().split("-");
			String formattedProductName = productName[0].trim();
			

			// COnvert array into array list for access contains method
			List<String> itemsNeededList = Arrays.asList(itemsNeeded);

			// Check whether name you extracted is present in arrayList or not
			int j = 0;
			if (itemsNeededList.contains(formattedProductName)) {
				
				j++;
				driver.findElements(By.cssSelector("div.product-action")).get(i).click();
				if (j == itemsNeeded.length) {
					break;
				}
				
			}
		}
	}
}
