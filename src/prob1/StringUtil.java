package prob1;

public class StringUtil {
    public static String concatenate( String[] str ){
        //문자열을 결합하여 리턴하는 메소드 구현
    	String result = "";
    	for( String str1 : str)
    	{
    		result += str1;
    	}
    	return result;
    }
}

