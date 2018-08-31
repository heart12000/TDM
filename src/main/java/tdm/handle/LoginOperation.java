package tdm.handle;

import java.io.IOException;

import tdm.base.BaseDriver;
import tdm.page.LoginPageElement;

/*对登陆页面的元素进行操作*/

public class LoginOperation {
	public BaseDriver driver;
	public LoginPageElement lpe;
	
	//将BaseDriver中实例化的drier传进来
	public LoginOperation(BaseDriver driver){
		this.driver = driver;
		lpe = new LoginPageElement(driver);
	}
	
	/*输入用户名*/
	public void inputUserName(String username) throws IOException{
		lpe.sendKeys(lpe.getUserNameElement(), username);
	}
	
	/*输入密码*/
	public void inputPWD(String pwd) throws IOException{
		lpe.sendKeys(lpe.getPWDeElement(), pwd);
	}
	
	/*点击登陆*/
	public void clickLoginButton() throws IOException{
		lpe.click(lpe.getLoginButtonElement());
	}
	
	/*判断是否是登陆页面*/
	public boolean assertLoginPage() throws IOException{
		return lpe.assertDisplay(lpe.getUserNameElement());
	}

}
