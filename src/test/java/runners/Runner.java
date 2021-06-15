package runners;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner {

	private WebDriver driver;
	private String ubicacionDriver = "C:\\Users\\Arbusta.250G7NRO14\\eclipse-workspace\\sura.tests\\src\\test\\resources\\chromedriver.exe";
	
	@Before
	public void setUp() {
		
		System.setProperty ("webdriver.chrome.driver", ubicacionDriver ); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		
	}
	
	@Test
	public void test_01 () { 
		
	WebElement searchbox = driver.findElement(By.name("q"));
	searchbox.clear();
	searchbox.sendKeys("funciona");
	searchbox.submit();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() {
		//ordenarAmbiente
		driver.quit();
	}
	

}
