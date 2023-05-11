package seleniumpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedrivernew.exe");
		
		// 2. Initialize Webdriver object through ChromeDriver class.
		ChromeDriver browserObject = new ChromeDriver();
		
		// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	        browserObject.manage().window().maximize();
	        browserObject.findElement(By.id("alert")).click();
	        Alert alert=browserObject.switchTo().alert();
	        System.out.println(alert.getText());
	       
	        Thread.sleep(4000);
	        alert.accept();
	        
	        browserObject.findElement(By.id("confirm")).click();
	        Alert alert1=browserObject.switchTo().alert();
	        System.out.println(alert1.getText());
	        Thread.sleep(4000);
	        alert1.accept();
	        
	        browserObject.findElement(By.id("prompt")).click();
	        
	        Alert alert2=browserObject.switchTo().alert();
	        System.out.println(alert2.getText());
	       
	        Thread.sleep(4000);
	       
	       
	        alert2.sendKeys("sree");
	        alert2.accept();
	        
	        Thread.sleep(1000);
//	        browserObject.close();
	        
	        

	}

}
