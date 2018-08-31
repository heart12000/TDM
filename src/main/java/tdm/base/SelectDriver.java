package tdm.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/*
 * 选择浏览器品牌
 * */

public class SelectDriver {
	public WebDriver driver;
	
	public WebDriver driverName(String browser){
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","D:/Selenium script recoder/chromedriver_win32_29/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
//			driver.get("https://testbpm.yktour.com.cn/");
			return driver;
		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		    return driver;
		}else {
			System.out.println("输入的浏览器版本错误");
			return null;
		}
	}

}
