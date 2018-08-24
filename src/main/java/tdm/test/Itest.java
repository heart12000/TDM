package tdm.test;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import tdm.base.BaseDriver;
import tdm.base.Login;
import tdm.util.TestNGListenerShot;

//testNG监听
@Listeners({TestNGListenerShot.class})
public class Itest extends BaseDriver{
	
	@Test
	public void test01() throws Exception{
		Login login = new Login();
		driver.get("https://testbpm.yktour.com.cn/");
		login.loginScript("username", "pwd");
		driver.findElement(By.className("df"));
		}

}
