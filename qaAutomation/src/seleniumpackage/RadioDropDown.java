package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 1. setup the property of chromedriver because we will perform Dropdown testing through chrome web browser.
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
				
				// 2. Initialize Webdriver object through ChromeDriver class.
		        	WebDriver browserObject = new ChromeDriver();
				// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
			        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
			        Select countrySelect=new Select(browserObject.findElement(By.name("country")));
			        countrySelect.selectByVisibleText("USA");//options [USA,India, Ethiopia,France]
			        //OR
			        countrySelect.selectByVisibleText("India");
			        
			   
			        
			        Select skillSelect=new Select(browserObject.findElement(By.name("skill")));
			        skillSelect.selectByVisibleText("Quality Assurance");
			        
			        //OR
			        skillSelect.selectByVisibleText("Database");
			        System.out.println("selectByVisibleText(\"Database");
			        
			        browserObject.findElement(By.name("submit")).click();
			        Thread.sleep(5000);
			    
			        System.out.println("Form Fill up Successful");
			       
			        
			        
			        browserObject.close();
}


	}


