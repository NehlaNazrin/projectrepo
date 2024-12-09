package pagepkg;
import java.time.Duration;
import java.util.concurrent.TimeoutException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Productpage {
	WebDriver driver;
	
	By chooseColor=By.cssSelector(".sku-item value-36.sku-img-box.img-replaced.click-reported.selected");
	By chooseSize=By.xpath("//*[@id=\"value_attr_16852930_2\"]/div[1]/div/div[5]");
	By addToCartbutton=By.xpath("//*[@id=\"order-action\"]");

 
public Productpage(WebDriver driver) {
	this.driver=driver;
}

public  void selectcolorandsize() throws TimeoutException, InterruptedException {	
	try {
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
	System.out.println("waiting for color element...");
	WebElement choosecolor= wait.until(ExpectedConditions.elementToBeClickable(chooseColor));
	System.out.println("color element is clickable...");
    choosecolor.isEnabled();
    Actions actions=new Actions(driver);
    actions.moveToElement(driver.findElement(chooseColor)).click().perform();
    
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(chooseColor));
    
    
    System.out.println("waiting for size element...");
    WebElement choosesize1 = wait.until(ExpectedConditions.elementToBeClickable(chooseSize));
    System.out.println("size element is clickable...");
    choosesize1.isEnabled();
    Actions actions1=new Actions(driver);
    actions1.moveToElement(driver.findElement(chooseSize)).click().perform();
    
    JavascriptExecutor js1 = (JavascriptExecutor) driver;
    js1.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(chooseSize));
    
    System.out.println("waiting for add to cart button....");
    WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(addToCartbutton));
    System.out.println("add to cart button is clickable...");
    addToCartButton.isEnabled();
    Actions actions2=new Actions(driver);
    actions2.moveToElement(driver.findElement(addToCartbutton)).click().perform();
	
    JavascriptExecutor js2 = (JavascriptExecutor) driver;
    js2.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(addToCartbutton));
    
    
	}catch(Exception e) {
	 System.out.println("Unexpected error occured: "+e.getMessage()); 
	 e.printStackTrace();
}

driver.getPageSource();
driver.switchTo().defaultContent();
Thread.sleep(1000);
}
}

