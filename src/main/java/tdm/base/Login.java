/**
 * 用于初始化登录tdm系统
 **/

package tdm.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public WebDriver driver;
	
	public void InitDriver(){
		System.setProperty("webdriver.chrome.driver","D:/Selenium script recoder/chromedriver_win32_29/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://testbpm.yktour.com.cn/");
	}
	
public static void main(String[] args) {
	Login login = new Login();
	login.InitDriver();
	}

}
