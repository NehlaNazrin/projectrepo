package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	 WebDriver driver;
	 
	 By searchbar=By.xpath("//*[@id=\"keywords\"]");
	 By searchbutton=By.xpath("//*[@id=\"uni-header\"]/div[2]/div/form/div/button");
	 
	 
	 public Homepage(WebDriver driver) {
		 this.driver=driver;
}
	 
	 public void Searchitems() {
		 driver.findElement(searchbar).sendKeys("jeans");
		 driver.findElement(searchbutton).click();
		 

}
	 public String getpageTitle() {
		 return driver.getTitle();
	 }
}


