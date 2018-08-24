package tdm.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import tdm.base.BaseDriver;

/*
 * 获取截图
 * */

public class GetScreenShot extends BaseDriver{
	
	public void takeScreenShot(){
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

}
