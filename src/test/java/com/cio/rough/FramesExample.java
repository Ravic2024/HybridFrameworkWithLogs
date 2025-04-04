package com.cio.rough;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesExample {
	
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.id("iframeResult"));
		
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		String title = driver.getTitle();
		System.out.println(title);
		

	}

}
