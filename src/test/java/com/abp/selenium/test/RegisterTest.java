  package com.abp.selenium.test;
  
  
  import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
  org.openqa.selenium.chrome.ChromeDriver; import
  org.testng.annotations.BeforeClass; import org.testng.annotations.Test;
  
  
  public class RegisterTest {
  
  static WebDriver driverRegister;
  
  @BeforeClass 
  public void initializer() {
  System.setProperty("Webdriver.chrome.driver", "drivers/chromedriver.exe");
  driverRegister = new ChromeDriver(); }
  
  @Test 
  public void loadHomePage() {
  driverRegister.navigate().to("http://localhost:4200/"); }
  
  
  @Test 
  public void registerDetails() {
  driverRegister.findElement(By.name("loginComponent")).click();
  driverRegister.findElement(By.name("movetoregister")).click();
  driverRegister.findElement(By.name("userName")).sendKeys("Abi");
  driverRegister.findElement(By.name("userEmail")).sendKeys("abi@gmail.com");
  driverRegister.findElement(By.name("userPassword")).sendKeys("abi123");
  driverRegister.findElement(By.name("userConfirmPassword")).sendKeys("abi123");
  driverRegister.findElement(By.name("clickregister"));
  System.out.println(driverRegister.getTitle());
  System.out.println("Register Successfully");
  driverRegister.close();
  
  }
  
  
  private Object is(String string) {
	// TODO Auto-generated method stub
	return null;
}

public static void main(String[] args) { RegisterTest obj = new
  RegisterTest(); obj.loadHomePage(); obj.registerDetails();
  
  } }
  
 
  