package com.maven.testdata;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mavendemo {
	
	
	@Test
	public void Demotest() {
		System.out.println(" Maven Demo Test ");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("Https://www.gmail.com");
		
		System.out.println(" 2nd time code adding");
		System.out.println(" 2nd person time code adding");



	}

}
