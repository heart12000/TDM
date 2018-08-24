package tdm.util;

public class GetElementProperties {
	
	public static String getValue(String key) throws Exception{
		PropertiesUtil pro = new PropertiesUtil("element.inputValue");
		String value = pro.getProperties(key);
		return value;
	}

}
