package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLoginLogout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare webdriver interface reference
				WebDriver browserObject;
				// 1. setup the property of chromedriver because we will perform testing of login process through chrome web browser.
			        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedrivernew.exe");
				// 2. Initialize Webdriver object through ChromeDriver class.
			        browserObject = new ChromeDriver();
				// 3. Open login page of https://mail.google.com/mail/&ogbl
			        browserObject.get("https://accounts.google.com/servicelogin");
			        WebElement identifierId= browserObject.findElement(By.id("identifierId"));
			        identifierId.sendKeys("knadhasree@gmail.com");
			       
			       browserObject.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[3]")).click();
			        
			        
			        
	}

}
