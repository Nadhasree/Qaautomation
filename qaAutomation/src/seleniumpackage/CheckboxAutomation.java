package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		// 2. Initialize Webdriver object through ChromeDriver class.
       		 WebDriver browserObject = new ChromeDriver();
		// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	        WebElement Bike=browserObject.findElement(By.xpath("/html/body/form/input[7]"));
	        Bike.click();
	        Thread.sleep(4500);
WebElement Car=browserObject.findElement(By.xpath("/html/body/form/input[8]"));
Car.click();
Thread.sleep(4500);
WebElement Boat=browserObject.findElement(By.xpath("/html/body/form/input[9]"));
Boat.click();
Thread.sleep(4500);
WebElement Horse=browserObject.findElement(By.xpath("/html/body/form/input[10]"));
Horse.click();
Thread.sleep(4500);
WebElement Submit=browserObject.findElement(By.xpath("/html/body/form/input[11]"));
Submit.click();
Thread.sleep(4500);
browserObject.close();
	}

}
