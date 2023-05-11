package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
	    // 2. Initialize Webdriver object through ChromeDriver class.
	  ChromeDriver  browserObject = new ChromeDriver();
	    // 3. Open form page of http://www.training.qaonlinetraining.com/testPage.php
	    browserObject.get("http://www.training.qaonlinetraining.com/testPage.php");
	    browserObject.findElement(By.id("email")).sendKeys("vanam.gmail.com");
	    
	    
	    
	  
	    

	}

}
