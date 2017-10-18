package if_empty_code;

/**
 * 判断是否为空
 */
public class enter {

	
	public static boolean isEmpty(String str){
		if(str==null || "".equals(str.trim())){ //trim方法去空格
			return true;
		}else{
			return false;
		}
	}
	
	
	public static boolean isNotEmpty(String str){
		if(str!=null && !"".equals(str.trim())){
			return true;
		}else{
			return false;
		}
	}
}
