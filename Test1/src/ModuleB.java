

public class ModuleB {       
	private ModuleA moduleA;              
	public void setModuleA(ModuleA moduleA) {              
		this.moduleA = moduleA;       
	}       
	/**        
	* ģ��B�ľ��崦������У�������ģ��A�Ľӿ�        
	*/       
	public String operate(String str1, String str2) {              
		// str1 ���滻��Ŀ�괮       
		// str2 ԭ��              
		return moduleA.operate(str1, str2);       
	}
}  
