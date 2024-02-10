package com.abp.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserLoginTest {

	static WebDriver driverUserLogin;

	@BeforeClass
	public void initializer() {
		System.setProperty("Webdriver.chrome.driver", "drivers/chromedriver.exe");
		driverUserLogin = new ChromeDriver();
	}

	@Test
	public void loadHomePage() {
		driverUserLogin.navigate().to("http://localhost:4200/");
	}

	@Test
	public void userLoginDetails() {
		driverUserLogin.findElement(By.name("loginComponent")).click();
		driverUserLogin.findElement(By.name("userEmail")).sendKeys("abi@gmail.com");
		driverUserLogin.findElement(By.name("userPassword")).sendKeys("abi123");
		driverUserLogin.findElement(By.name("loginComponent")).click();
		System.out.println(driverUserLogin.getTitle());
		System.out.println("Register Successfully");
		driverUserLogin.close();

	}

	public static void main(String[] args) {
		UserLoginTest obj = new UserLoginTest();
		obj.loadHomePage();
		obj.userLoginDetails();

	}
}
