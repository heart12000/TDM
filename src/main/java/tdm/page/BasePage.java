package tdm.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import tdm.base.BaseDriver;

/*封装页面公共元素*/

public class BasePage {
	public BaseDriver driver;
	
	public BasePage(BaseDriver driver){
		this.driver = driver;
	}
	
	/*封装element方法*/
	public WebElement element(By by){
		WebElement element = driver.findElement(by);
		return element;
	}
	
	/*点击方法*/
	public void click(WebElement element){
		if(element != null){
			element.click();
		}else{
			System.out.println("元素不存在");
		}	
	}
	
	/*输入方法*/
	public void sendKeys(WebElement element,String values){
		if(element != null){
			element.sendKeys(values);
		}else{
			System.out.println("元素不存在");
		}	
	}
	
    /*	判断元素是否显示*/
	public boolean assertDisplay(WebElement element){
		return element.isDisplayed();
	}
	
    /*	判断元素是否可用*/
	public boolean assertEnabled(WebElement element){
		return element.isEnabled();
	}
	
    /*	判断元素是否可选*/
	public boolean assertSelected(WebElement element){
		return element.isSelected();
	}
}
