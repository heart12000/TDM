package tdm.util;

/*
 * 监听到case运行失败后，进行截图
 * 继承TestListenerAdapter类，对其中的方法进行重写
 * */

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import tdm.base.CaseDriver;

public class TestNGListenerShot extends TestListenerAdapter {
	public CaseDriver driver;
	
	  @Override
	  public void onTestSuccess(ITestResult tr) {
		  super.onTestSuccess(tr);
	  }

	  @Override
	  public void onTestFailure(ITestResult tr) {
		  takeScreenShot(driver);
		  super.onTestFailure(tr);
	  }
	  
	  @Override
	  public void onTestSkipped(ITestResult tr) {
		  super.onTestSkipped(tr);
	  }
	  
//	  截图方法
	  public void takeScreenShot(CaseDriver driver){
			long time = System.currentTimeMillis();
			String curPath = System.getProperty("user.dir");
			System.out.println(curPath);
			String cutTime = String.valueOf(time);
			String name = "ScreenShot" + cutTime + ".png";
			String path = curPath + "/" + "test-output" + "/" + name;
			File png =  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			try {
				FileUtils.copyFile(png, new File(path));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

}
