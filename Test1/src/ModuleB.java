

public class ModuleB {       
	private ModuleA moduleA;              
	public void setModuleA(ModuleA moduleA) {              
		this.moduleA = moduleA;       
	}       
	/**        
	* 模块B的具体处理操作中，调用了模块A的接口        
	*/       
	public String operate(String str1, String str2) {              
		// str1 待替换的目标串       
		// str2 原串              
		return moduleA.operate(str1, str2);       
	}
}  
