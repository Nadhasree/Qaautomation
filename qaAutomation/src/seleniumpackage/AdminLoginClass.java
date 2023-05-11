package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLoginClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare webdriver interface reference
		WebDriver browserObject;
		// 1. setup the property of chromedriver because we will perform testing of login process through chrome web browser.
	        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize Webdriver object through ChromeDriver class.
	        browserObject = new ChromeDriver();
		// 3. Open login page of https://admin-demo.nopcommerce.com/login
	        browserObject.get("https://admin-demo.nopcommerce.com/login");
	        
	        WebElement email= browserObject.findElement(By.name("Email"));
	        email.clear();
	        email.sendKeys("admin@yourstore.com");
	        WebElement pass= browserObject.findElement(By.name("Password"));
	        pass.clear();
	        pass.sendKeys("admin");
	        WebElement button=  browserObject.findElement(By.className("login-button"));
	        button.submit();
	        

	}

}
