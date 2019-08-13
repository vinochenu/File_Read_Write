package com.read_write;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Read_PropertyFile {
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = null ;
		
		FileInputStream fis=new FileInputStream("C:\\vinoth\\Selenium\\File_Read_Write\\config.properties");

		Properties properties =new Properties();
		
		properties.load(fis);
		
		String browser=properties.getProperty("Browser");
		
		String driverlocation=properties.getProperty("DriverLocation");
		
		System.setProperty("webdriver.chrome.driver", driverlocation);
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
		/*if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverlocation);
			driver=new ChromeDriver();
			
			
			
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", driverlocation);
			driver=new FirefoxDriver();
			
		}
		else{
		System.out.println("no driver found out");
		}
		
			driver.get("https://www.google.com/");
		
		*/
	
	}

}
