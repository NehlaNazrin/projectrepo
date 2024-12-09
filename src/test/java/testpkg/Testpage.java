package testpkg;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import basepkg.Baseclass;
import pagepkg.Cartpage;
import pagepkg.Homepage;
import pagepkg.Loginpage;
import pagepkg.Productpage;
import pagepkg.Searchresultpage;

@Test
public class Testpage extends Baseclass {
	private Loginpage loginpage;
	private Homepage homepage;
	  private Searchresultpage searchresultpage;
	  private Productpage productpage;
	  private Cartpage cartpage;
	  
	  
	  @BeforeTest
	  public void setuptest() {
		  loginpage=new Loginpage(driver);
		  homepage=new Homepage(driver);
		  searchresultpage=new Searchresultpage(driver);
		  productpage=new Productpage(driver);
		  cartpage=new Cartpage(driver);
	  }
	  public void testwebsite() throws Exception {
		  loginpage.CreateMyAccount();
		  homepage.Searchitems();
          searchresultpage.SelectFirstItem();
		  productpage.selectcolorandsize();
		  cartpage.proceedtobuy();
		  driver.getTitle();
		  driver.navigate().back();  
	  }

}

