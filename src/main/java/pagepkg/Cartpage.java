package pagepkg;

import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cartpage {
	WebDriver driver;
	
	By checkOut=By.xpath("/html/body/div[7]/div[3]/div[2]/div[2]/div[1]/div[6]/span/a");
	By countrybutton=By.xpath("//*[@id=\"select2-country_05333674339411691-container\"]/div/sapn");
	By Firstname=By.xpath("//*[@id=\"firstName_0.6673686909746055\"]");
	By Lastname=By.xpath("//*[@id=\"lastName_0.33598883085383546\"]");
	By phone=By.xpath("//*[@id=\"phoneNumber_0.5873077547411067\"]");
	By Address=By.xpath("//*[@id=\"streetAddress_0.13576470436880994\"]");
	By country=By.xpath("//*[@id=\"select2-region_025313938323396457-container\"]/span/sapn");
	By city=By.xpath("//*[@id=\"city_0.059690849706921734\"]");
	By postalcode=By.xpath("//*[@id=\"zipCode_0.1209417961007746\"]");
	By save=By.xpath("//*[@id=\"addFirstAddressWrapper\"]/div/div/div[2]/button");
	By Continue=By.xpath("//*[@id=\"orderSummaryContinuePayBtn\"]");

	
	
	public Cartpage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void proceedtobuy() {
		try {
		
			        double result = (10 ); 
			        System.out.println("Result: " + result);
			    } catch (IllegalArgumentException e) {
			        System.out.println("Error: " + e.getMessage());
	   
		
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3/0));
	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
	    By.xpath("/html/body/div[7]/div[3]/div[2]/div[2]/div[1]/div[6]/span/a")));
       element.click();
		WebElement country=driver.findElement(countrybutton);
		 Select ob=new Select(country);
		 ob.selectByVisibleText("South Africa");
       driver.findElement(Firstname).sendKeys("aryan");
       driver.findElement(Lastname).sendKeys("guptaal");
       driver.findElement(phone).sendKeys("084 711 1168");
       driver.findElement(Address).sendKeys("1976 Schoeman St");
       driver.findElement(city).sendKeys("Hluhluwe");
       driver.findElement(postalcode).sendKeys("3960");
       driver.findElement(save).click();
       driver.findElement(Continue).click();
       
   
       
	}

}
}