package basepkg;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	protected WebDriver driver;
	
@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
    driver.get("https://www.lightinthebox.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}


public void teardown() {
	if (driver !=null) {
		driver.quit();
	}
}
}

