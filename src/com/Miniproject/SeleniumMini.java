package com.Miniproject;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumMini {
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Create and Register Account
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Johnpravin02@gmail.com");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
	
	
	/*List<WebElement>list= driver.findElements(By.xpath("//div[@id='create_account_error']/ol/li/text()"));
	for(WebElement e:list)
	{
		e.getText();
	}
		*/
		
		//Registration Form WebElements 
		
	   WebElement ele1=driver.findElement(By.id("id_gender1"));
	   ele1.click();
	
       driver.findElement(By.id("customer_firstname")).sendKeys("John");
       driver.findElement(By.id("customer_lastname")).sendKeys("Pravin");
	
       driver.findElement(By.id("passwd")).sendKeys("John@1234");
       
    WebElement dropday=  driver.findElement(By.id("days"));
    Select dropoption=new Select(dropday);
    dropoption.selectByValue("8");
    
	WebElement dropmonth=driver.findElement(By.id("months"));
	Select dropoption2=new Select(dropmonth);
	dropoption2.selectByValue("3");
	
	WebElement dropyear=driver.findElement(By.id("years"));
	Select dropoption3=new Select(dropyear);
	dropoption3.selectByValue("1992");
	
	List<WebElement>checkboxlist=driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(WebElement check:checkboxlist)
	{
		check.click();
	}
	
	driver.findElement(By.id("firstname")).sendKeys("JohnPravin");
	driver.findElement(By.id("lastname")).sendKeys("Kumar");
	driver.findElement(By.id("company")).sendKeys("Sterling And Wilson Pvt Ltd");
	driver.findElement(By.id("address1")).sendKeys("Loorthu Nagar,Manakudy P.O");
	driver.findElement(By.id("address2")).sendKeys("No:1/19,NavaJeevan Building,1'St Floor");
	driver.findElement(By.id("city")).sendKeys("Nagercoil");
	WebElement dropstate=driver.findElement(By.id("id_state"));
	Select dropoption4=new Select(dropstate);
	dropoption4.selectByValue("9");
	driver.findElement(By.id("postcode")).sendKeys("90210");
	driver.findElement(By.id("other")).sendKeys("Hi!My name John I'm From India");
	driver.findElement(By.id("phone")).sendKeys("20925578");
	driver.findElement(By.id("phone_mobile")).sendKeys("6381219170");
	driver.findElement(By.id("alias")).sendKeys("No:1/19,los,US");
	driver.findElement(By.id("submitAccount")).click();
	
	//Sign out 
	
	driver.findElement(By.linkText("Sign out")).click();
	
	//Sign In
	
	driver.findElement(By.id("email")).sendKeys("Johnpravin02@gmail.com");
	driver.findElement(By.id("passwd")).sendKeys("John@1234");
	driver.findElement(By.id("SubmitLogin")).click();
	
	//Sign out
	driver.findElement(By.linkText("Sign out")).click();
	
	
	driver.close();
	
		}
		 
				
		 }

