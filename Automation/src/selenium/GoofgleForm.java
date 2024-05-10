package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class GoofgleForm {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		//Firstname 
		driver.findElement(By.name("firstname")).click();
		driver.findElement(By.name("firstname")).sendKeys("varun");
		//Lastname
		driver.findElement(By.name("lastname")).click();
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		//Gender
		driver.findElement(By.id("sex-0")).click();
		//Experience
		driver.findElement(By.id("exp-2")).click();
		//Date
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.id("datepicker")).sendKeys("24/04/2000");
		//profession
		driver.findElement(By.id("profession-1")).click();
		//Tools
		driver.findElement(By.id("tool-2")).click();
		//Continents
		Select Title=new Select(driver.findElement(By.name("continents")));
		Title.selectByVisibleText("North America");
        //commands
		Select Title1=new Select(driver.findElement(By.id("selenium_commands")));
		Title1.selectByVisibleText("WebElement Commands");
		//Button
		driver.findElement(By.id("submit")).click();
	}

}
