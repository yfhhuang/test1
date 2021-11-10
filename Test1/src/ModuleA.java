
public class ModuleA {
	/*** 实现把 str1 中包含的 str2 去掉后的内容返回的功能        
	* @param str1 字符串1
	* @param str2 字符串2        
	* @param 返回处理的结果        
	*/       
	public String operate(String str1, String str2) {              
		return str1.replace(str2, "");       
	}
}
