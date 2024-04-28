import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		//Parent to child, Sibling to sibling traverse
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
		//Child to parent traverse
		//button[1]/parent::div
		System.out.println(driver.findElement(By.xpath("//button[1]/parent::div/button[2]")).getText());
	}

}
