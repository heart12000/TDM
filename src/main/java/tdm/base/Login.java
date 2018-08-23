/**
 * 用于初始化登录tdm系统
 **/

package tdm.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import tdm.util.GetSplitValue;
import tdm.util.getElementProperties;

public class Login {
	public WebDriver driver;
	
	public void InitDriver(){
		System.setProperty("webdriver.chrome.driver","D:/Selenium script recoder/chromedriver_win32_29/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://testbpm.yktour.com.cn/");
	}
	
	public static void main(String[] args) throws Exception {
		Login login = new Login();
		login.InitDriver();
	//	WebDriver Driver = login.driver;
	//	Driver.findElement(GetSplitValue.getElementValue("loginname")).sendKeys("200880");
	//	Driver.findElement(GetSplitValue.getElementValue("loginpwd")).sendKeys("1qaw32");
	//	Driver.findElement(GetSplitValue.getElementValue("loginbutton")).click();
		login.loginScript("username","pwd");
		}

	public WebElement iDriver(String key) throws Exception{
		if(driver.findElement(GetSplitValue.getElementValue(key)).isDisplayed()){
			return driver.findElement(GetSplitValue.getElementValue(key));
		}else{
			System.out.println("元素获取失败");
			return null;
		}
	}
	
	public void loginScript(String username,String pwd) throws Exception{
		if(iDriver("loginname").isDisplayed()){
			System.out.println("登录名输入框显示正常");
		}else{
			System.out.println("登录名输入框显示不不不不不不正常！！！！！");
		}
		iDriver("loginname").sendKeys(getElementProperties.getValue(username));
		if(iDriver("loginpwd").isDisplayed()){
			System.out.println("登录密码输入框显示正常");
		}else{
			System.out.println("登录密码输入框显示不不不不不不正常！！！！");
		}
		iDriver("loginpwd").sendKeys(getElementProperties.getValue(pwd));
		if(iDriver("loginbutton").isDisplayed()){
			System.out.println("登陆按钮显示正常");
		}else{
			System.out.println("登录按钮显示不不不不不不正常！！！！");
		}
		iDriver("loginbutton").click();
	}

}









