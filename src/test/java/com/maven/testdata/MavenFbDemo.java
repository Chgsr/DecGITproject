package com.maven.testdata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenFbDemo {
	
	@Test
	public void display() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("Https://www.facebook.com");
		

	}

}
