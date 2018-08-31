package tdm.testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import tdm.base.BaseDriver;
import tdm.base.CaseDriver;
import tdm.business.LoginProcess;
import tdm.util.TestNGListenerShot;

/*测试登陆页面*/
@Listeners(TestNGListenerShot.class)
public class TestLogin extends CaseDriver{
	public BaseDriver driver;
	public LoginProcess lp;
	
	public TestLogin(){
		this.driver = initCaseDriver("chrome");
		lp = new LoginProcess(driver);
	}
	
	@Test
	public void getHomePage(){
		driver.get("https://testbpm.yktour.com.cn/");
	}
	
	@Test(dependsOnMethods={"getHomePage"})
	public void testLogin() throws IOException{
		lp.login("200880", "1qaw32");
//		driver.findElement(By.className("xd"));
	}
	

}
