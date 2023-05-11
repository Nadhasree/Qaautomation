package seleniumpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver browserObject;
			// 1. setup the property of chromedriver to perform blank alert through chrome web browser. 
		        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			
			// 2. Initialize Webdriver object through ChromeDriver class.
		        browserObject = new ChromeDriver();
		       // 3. Open the form page https://mail.rediff.com/cgi-bin/login.cgi
		        browserObject.get("https://mail.rediff.com/cgi-bin/login.cgi");
		        
		        browserObject.findElement(By.name("proceed")).click();
		        Alert signin=browserObject.switchTo().alert();
		        System.out.println(signin.getText());
		        Thread.sleep(5000);
signin.accept();
browserObject.close();
	}

}
