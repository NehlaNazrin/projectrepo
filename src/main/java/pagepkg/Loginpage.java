package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	WebDriver driver;
	
	By signin=By.xpath("//*[@class=\"iconfont-account\"]");
	By email=By.xpath("//*[@placeholder=\"Email Address\"]");
	By password=By.xpath("//*[@id=\"registerPassword\"]");
	By createaccount=By.xpath("//*[@id=\"J_RegisterSumbit\"]");
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void CreateMyAccount() {
		driver.findElement(signin).click();
		driver.findElement(email).sendKeys("aryanandhantgvjknko5375@gmail.com");
		driver.findElement(password).sendKeys("arya1234578");
		driver.findElement(createaccount).click();
		
	}

}

