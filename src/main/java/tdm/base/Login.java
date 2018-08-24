/**
 * 用于初始化登录tdm系统
 **/

package tdm.base;

import org.openqa.selenium.WebElement;
import tdm.util.GetElementProperties;
import tdm.util.GetSplitValue;

public class Login{
//	public WebDriver driver;
	
//	public void InitDriver(){
//		System.setProperty("webdriver.chrome.driver","D:/Selenium script recoder/chromedriver_win32_29/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
//		driver.get("https://testbpm.yktour.com.cn/");
//	}
//	
/*	
 * public void takeScreenShot(){
//		截图以时间进行命名
		long time = System.currentTimeMillis();
		String curPath = System.getProperty("user.dir");
		System.out.println(curPath);
		String cutTime = String.valueOf(time);
		String name = cutTime + ".png";
		String path = curPath + "/" + "test-output" + "/" + name;
		File png =  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(png, new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	*/
	
//	@Test
//	public void loginTestCase() throws Exception {
//		Login login = new Login();
//		login.loginScript("username","pwd");
//		}
	
	public WebElement iDriver(String key) throws Exception{
		if(BaseDriver.driver.findElement(GetSplitValue.getElementValue(key)).isDisplayed()){
			return BaseDriver.driver.findElement(GetSplitValue.getElementValue(key));
		}else{
			System.out.println("元素获取失败");
			return null;
		}
	}
	
	public void loginScript(String username,String pwd) throws Exception{
//		GetScreenShot gs = new GetScreenShot();
		if(iDriver("loginname").isDisplayed()){
			System.out.println("登录名输入框显示正常");
		}else{
			System.out.println("登录名输入框显示不不不不不不正常！！！！！");
		}
		iDriver("loginname").sendKeys(GetElementProperties.getValue(username));
		if(iDriver("loginpwd").isDisplayed()){
			System.out.println("登录密码输入框显示正常");
//			gs.takeScreenShot();
		}else{
			System.out.println("登录密码输入框显示不不不不不不正常！！！！");
		}
		iDriver("loginpwd").sendKeys(GetElementProperties.getValue(pwd));
		
		if(iDriver("loginbutton").isDisplayed()){
			System.out.println("登陆按钮显示正常");
			
		}else{
			System.out.println("登录按钮显示不不不不不不正常！！！！");
		}
		iDriver("loginbutton").click();
	}
	
	

}









