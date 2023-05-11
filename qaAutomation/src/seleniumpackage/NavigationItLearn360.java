package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationItLearn360 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedrivernew.exe");
				// 2. Initialize WebDriver object through ChromeDriver class.
			        WebDriver browserObject=new ChromeDriver();
				// 3. Open the web page https://www.itlearn360.com/
			        browserObject.get("https://www.itlearn360.com/");
			       browserObject.findElement(By.className("fa-facebook")).click();
			       browserObject.navigate().back();
			       browserObject.findElement(By.className("fa-twitter")).click();
			       browserObject.navigate().back();
			       browserObject.findElement(By.className("fa-instagram")).click();
			       browserObject.navigate().back();
			       browserObject.findElement(By.className("fa-youtube")).click();
			       browserObject.navigate().back();
			       browserObject.findElement(By.className("fa-linkedin")).click();
			       browserObject.navigate().back();
			       browserObject.close();
			        
			      

	}

}
