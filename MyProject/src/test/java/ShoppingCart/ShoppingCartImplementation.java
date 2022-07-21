package ShoppingCart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShoppingCartImplementation {
 
  
  WebDriver driver;
  @Test
  public void Shoppingcart() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("http://demowebshop.tricentis.com/");
	  driver.findElement(By.partialLinkText("Jewelry")).click();
	  driver.findElement(By.xpath("//a[text()='Black & White Diamond Heart']")).click();
	  
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@id='add-to-cart-button-14']")).click();
	  Thread.sleep(3000);
	  WebElement elem=driver.findElement(By.xpath("//span[text()='Shopping cart']"));
	  Thread.sleep(3000);
	  elem.click();
	  Thread.sleep(3000);

	  WebElement elem1=driver.findElement(By.xpath("//a[text()='Black & White Diamond Heart' and @class='product-name']/../..//input[@class='qty-input']"));
	  String price=driver.findElement(By.xpath("//a[@class='product-name' and text()='Black & White Diamond Heart']/../..//span[@class='product-subtotal']")).getText();
	  elem1.clear();
	  float actual_price=Float.valueOf(price);
	  System.out.println(actual_price);
	  int value=3;
	  String val=""+value;
	  System.out.println(val);
	  elem1.sendKeys(val);
	  elem1.sendKeys(Keys.ENTER);
	  String updated_price=driver.findElement(By.xpath("//a[@class='product-name' and text()='Black & White Diamond Heart']/../..//span[@class='product-subtotal']")).getText();
	  float updated_value=Float.valueOf(updated_price);
	  if(updated_value==value*actual_price)
	  {
		  System.out.println("Shopping cart updated successfully");
	  }
	  
  }
}
