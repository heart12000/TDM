package tdm.base;

/*生成公共driver，测试类直接继承获取driver*/

public class CaseDriver {
	
	public BaseDriver initCaseDriver(String browser){
		return new BaseDriver(browser);
	}

}
