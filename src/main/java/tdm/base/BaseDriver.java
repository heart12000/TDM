package tdm.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseDriver {
	
	/*公共driver*/
	public WebDriver driver;
	
	public BaseDriver(String browser){
		SelectDriver selectDriver = new SelectDriver();
		driver = selectDriver.driverName(browser);
	}
	
	/*封装关闭driver方法*/
	public void close(){
		driver.close();
	}
	
	/*封装Element方法*/
	public WebElement findElement(By by){
		return driver.findElement(by);
	}
	
	/*封装get方法*/
	public void get(String url){
		driver.get(url);
	}

}
