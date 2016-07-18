import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTest {
public static void main(String[] args) throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.google.pl");
	Thread.sleep(2000);
	WebElement element=driver.findElement(By.name("q"));	
	element.sendKeys("Selenide");
		element.submit();
		driver.findElement(By.name("btnG")).click();
		System.out.println (driver.findElements(By.tagName("a")).size());
		Thread.sleep(3000);
		
		System.out.println (driver.findElements(By.className("g")).size());
		System.out.println (driver.findElement(By.id("resultStats")).getText());
		Thread.sleep(3000);
		
		driver.close();
}
}
