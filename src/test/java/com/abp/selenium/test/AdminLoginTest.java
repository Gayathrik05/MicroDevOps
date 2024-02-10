package com.abp.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AdminLoginTest {

	static WebDriver driverLogin;

	@BeforeClass
	public void initializer() {
		System.setProperty("Webdriver.chrome.driver", "drivers/chromedriver.exe");
		driverLogin = new ChromeDriver();
	}

	@Test
	public void loadHomePage() {
		driverLogin.navigate().to("http://localhost:4200/");
	}

	@Test
	public void adminLoginDetails() {
		driverLogin.findElement(By.name("loginComponent")).click();
		driverLogin.findElement(By.name("userEmail")).sendKeys("admin@gmail.com");
		driverLogin.findElement(By.name("userPassword")).sendKeys("admin123");
		driverLogin.findElement(By.cssSelector(".ng-dirty:nth-child(3)")).click();
		driverLogin.findElement(By.name("adminComponent")).click();
		System.out.println(driverLogin.getTitle());
		System.out.println("Admin Login Successfully");

	}

	public static void main(String[] args) {
		AdminLoginTest obj = new AdminLoginTest();
		obj.loadHomePage();
		obj.adminLoginDetails();

	}
}
