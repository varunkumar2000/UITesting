package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver=new ChromeDriver();
         driver.get("https:demo.guru99.com/v4");
         driver.findElement(By.name("uid")).sendKeys("mngr26593");
         driver.findElement(By.name("password")).sendKeys("654321!");
         driver.findElement(By.name("btnLogin")).click();
	}

		
	}


