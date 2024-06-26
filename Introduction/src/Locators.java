import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		//when something is not showing up in page, wait 5 seconds before failing
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("k3llyr00@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("k3llyr00@gmail.com");
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Kelly");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("not_correct@gmail.com");
		//when multiple elements are matching, use index number.
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("correct@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("56666666");
		
		//if the button is visible,  but not clickable
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".reset-pwd-btn")));
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("k3llyr00@gmail.com");
		
		// * is regular expression, because we are searching partial.
		driver.findElement(By.cssSelector("input[placeholder*='Pass']")).sendKeys("rahulshettyacademy");
		
		Thread.sleep(1000);
		
		// regular expression for XPath contains(@atribute, 'value')
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
		
		
 		//driver.close();

	}

}
