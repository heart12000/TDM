/**
 * 读取记录有定位元素的配置文件
 **/

package tdm.util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
	private String FilePath;
	private Properties prop;
	
	//用作传入配置文件路径
	public PropertiesUtil(String FilePath) throws IOException{
		this.FilePath = FilePath;
		this.prop = readProperites();
	}
	
	//读取配置文件
	private Properties readProperites() throws IOException{
		Properties properties = new Properties();
		try {
			InputStream ElementFile = new FileInputStream(FilePath);
			BufferedInputStream in = new BufferedInputStream(ElementFile);
			properties.load(in);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
	}
		return properties;
}
	
	public String getProperties(String key) throws IOException{
		if(prop.containsKey(key)){
			String keys = prop.getProperty(key);
			return keys;
		}else{
			System.out.println("key不存在");
			return "";
		}
	  }
}

