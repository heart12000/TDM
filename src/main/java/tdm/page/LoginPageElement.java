package tdm.page;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import tdm.base.BaseDriver;
import tdm.util.GetSplitValue;

public class LoginPageElement extends BasePage{

	public LoginPageElement(BaseDriver driver) {
		super(driver);
	}
	
	/*获取用户名输入框*/
	public WebElement getUserNameElement() throws IOException{
		WebElement userName = element(GetSplitValue.getElementValue("loginname"));
		return userName;		
	}
	
   /*	获取密码输入框*/
	public WebElement getPWDeElement() throws IOException{
		WebElement pwd = element(GetSplitValue.getElementValue("loginpwd"));
		return pwd;
	}
	
	/*获取登陆按钮*/
	public WebElement getLoginButtonElement() throws IOException{
		WebElement loginbutton = element(GetSplitValue.getElementValue("loginbutton"));
		return loginbutton;
	}

}
