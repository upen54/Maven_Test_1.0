package com.maven;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MavenTest {
	public static WebDriver driver;
	
	@Test
	public void TestBrowser(){
		
	System.setProperty("webdriver.gecko.driver","C:\\Users\\upen5\\geckodriver-v0.17.0-win64\\geckodriver.exe");	
	
	 driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://bloomingdales.com/");
	
	PageFactory.initElements(driver, this);
	
	System.out.println("welcome to testng");
	//Click_On_Link("Images");
	
	}
	
	//@Test
	
	
	/*public void Click_On_Link(String linkname){
		
		List<WebElement> listitems=driver.findElements(By.tagName("a"));
		
		System.out.println("cound of list"+ listitems.size());
		outerloop:
		for(WebElement link : listitems  ){
			
			if(link.getText().equalsIgnoreCase(linkname)){
				
				
				link.click();
				
				break outerloop;
				
				
			}
			
						
		}
			
	}
	
	@Test
	public void WindowHandlerForPages() {
		
		String parent=driver.getWindowHandle();
		
		Set<String>s1=driver.getWindowHandles();
		
		Iterator<String>l1=s1.iterator();
		
		while(l1.hasNext())
			
		{
			
			String child=l1.next();
			
			if(!parent.equals(child)){
				
				driver.switchTo().window(child);
				System.out.println(driver.switchTo().window(child).getCurrentUrl());
				
				driver.close();
			}
			
		}
		
		driver.switchTo().window(parent);
		
	}*/
}
