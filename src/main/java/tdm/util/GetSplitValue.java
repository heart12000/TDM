package tdm.util;

import java.io.IOException;

import org.openqa.selenium.By;

public class GetSplitValue {
/*
 * 自动获取拆分keys值
 * */
	public static By getElementKeys(String key) throws IOException{
		PropertiesUtil prop = new PropertiesUtil("element.properties");
		String Element = prop.getProperties(key);
		String ElementType = Element.split(">")[0];
		String ElementValue = Element.split(">")[1];
		
		if(ElementType.equals("id")){
			return By.id(ElementValue);			
		}else if (ElementType.equals("name")) {
			return By.name(ElementValue);
		}else if(ElementType.equals("className")){
			return By.className(ElementValue);
		}else if(ElementType.equals("cssSelector")){
			return By.cssSelector(ElementValue);
		}else if(ElementType.equals("linkText")){
			return By.linkText(ElementValue);
		}else{
			return By.xpath(ElementValue);
		}
	}
	
}
