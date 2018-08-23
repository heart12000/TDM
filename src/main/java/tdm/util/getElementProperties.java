package tdm.util;

public class getElementProperties {
	
	public static String getValue(String key) throws Exception{
		PropertiesUtil pro = new PropertiesUtil("element.inputValue");
		String value = pro.getProperties(key);
		return value;
	}

}
