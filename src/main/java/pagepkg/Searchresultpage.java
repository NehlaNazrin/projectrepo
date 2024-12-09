package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Searchresultpage {
	WebDriver driver;
	
	By FirstItem=By.xpath("/html/body/div[6]/div[3]/div[2]/div[2]/div/a[2]");
	
	
	
	public Searchresultpage(WebDriver driver) {
		this.driver=driver;
	}

	
	public void SelectFirstItem() {
		driver.findElement(FirstItem).click();
		
	}
}
