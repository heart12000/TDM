package tdm.business;

import java.io.IOException;

import tdm.base.BaseDriver;
import tdm.handle.LoginOperation;

/*登陆流程*/

public class LoginProcess {
	LoginOperation loginOperation;
	
	public LoginProcess(BaseDriver driver){
		loginOperation = new LoginOperation(driver);
	}
	
	public void login(String username,String pwd) throws IOException{
		if(loginOperation.assertLoginPage()){
			loginOperation.inputUserName(username);
			loginOperation.inputPWD(pwd);
			loginOperation.clickLoginButton();
		}else{
			System.out.println("页面不存在");
		}

	}

}
