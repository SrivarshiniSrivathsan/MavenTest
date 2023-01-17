package com.MavenTest;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class Basic 
{
    @Test
    public void google()
    {
    	//WebDriverManager.chromedriver().setup();

    	ChromeOptions option = new ChromeOptions();
    	WebDriver driver = new ChromeDriver(option);
    	option.addArguments("--disable notifications");

    	driver.get("https://google.com/");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));   	 

    	String title = driver.getTitle();
    	System.out.println(title);
    }
}
