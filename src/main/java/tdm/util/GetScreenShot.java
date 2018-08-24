package tdm.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import tdm.base.Login;

/*
 * 获取截图
 * */

public class GetScreenShot {
	
	public void takeScreenShot(){
		Login login = new Login();
//		截图以时间进行命名
		long time = System.currentTimeMillis();
		String curPath = System.getProperty("user.dir");
		System.out.println(curPath);
		String cutTime = String.valueOf(time);
		String name = cutTime + ".png";
		WebDriver driver = login.driver;
		String path = curPath + "/" + "test-output" + "/" + name;
		File png =  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(png, new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
