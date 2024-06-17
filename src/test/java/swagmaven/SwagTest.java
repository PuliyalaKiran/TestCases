package swagmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwagTest {
     @Test
	public static void Login() {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver-win64\\chromedriver-win64.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\geckodriver-v0.34.0-win64\\geckodriver.exe");
        driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"app_logo\"]"));
		String Title = driver.getTitle();
		System.out.println("Page Title:"+Title);
		WebElement titleElement= driver.findElement(By.xpath("//a[@id=\"item_4_title_link\"]"));
		String pageTitle = titleElement.getText();
		System.out.println("card Title:"+pageTitle);
		WebElement currencyElement= driver.findElement(By.xpath("//div[@class=\"inventory_item_price\"]"));
		String currency = currencyElement.getText();
		System.out.println("Backpack:"+currency);
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		driver.findElement(By.xpath("//button[@id=\"remove-sauce-labs-backpack\"]")).click();
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		driver.findElement(By.xpath("//option[@value=\"za\"]")).click();
		driver.findElement(By.xpath("//option[@value=\"lohi\"]")).click();
		driver.findElement(By.xpath("//option[@value=\"hilo\"]")).click();
		driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();
		System.out.println("Login successfully");
		
	}

}
