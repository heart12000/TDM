package tdm.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/*
 * 生成公共driver
 * */

public class BaseDriver {
	public static WebDriver driver;
	
	@BeforeMethod
	public void test01() throws Exception{
		System.out.println("这是---@BeforeMethod");
	}
	
	@BeforeClass
	public WebDriver initDriver(){
		System.setProperty("webdriver.chrome.driver","D:/Selenium script recoder/chromedriver_win32_29/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
//		driver.get("https://testbpm.yktour.com.cn/");
		return driver;
	}
	
	@AfterMethod
	public void test03(){
		System.out.println("这是---@AfterMethod");
	}
	
	@AfterClass
	public void close() throws InterruptedException{
		Thread.sleep(2000);
		driver.close();
	}

}
