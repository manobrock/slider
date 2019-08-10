package slider.slider;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class slider {
	
	WebDriver driver;
	
	
	@Test
	public void slider1() {
		try {
		WebElement slider = driver.findElement(By.xpath("//a[@class='ui-slider-handle ui-state-default ui-corner-all']"));
		Actions action = new Actions(driver);
		action.clickAndHold(slider).moveByOffset(150, 0).build().perform();
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
		
	}
	}
	@Before
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Slider.html");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

}
