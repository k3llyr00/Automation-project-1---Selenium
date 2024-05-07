import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class UIExercise {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Kelly");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("some@email.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("SuperSecretPasswordLOL_;!");
		driver.findElement(By.id("exampleCheck1")).click(); // always loving the ice cream
		
		// Static drop-down with select tag
		WebElement genderDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select gender = new Select(genderDropdown);
		gender.selectByIndex(1); //Select the option 'Female'
		
		driver.findElement(By.id("inlineRadio1")).click();
		
		//hacking, because .sendKeys("26-Dec-1993"), .sendKeys("26-12-1993"), .sendKeys("2612-1993") etc didnt work
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("2612");
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys(Keys.ARROW_RIGHT);
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("1993");

		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		Assert.assertTrue(driver.findElement(By.className("alert-success")).
				getText().contains("The Form has been submitted successfully!"));
		
		driver.close();
	}
}