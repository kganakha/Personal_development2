package app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AxizUtil {

	public static boolean isSmallAlphabet(String str){
	    boolean f = true;

	    try{
		    String arufa = "[^a-zA-Z]+$";
		    Pattern p = Pattern.compile(arufa);
		    Matcher m = p.matcher(str);
	        if(str.length() == 0 || m.find()){
	            return false;
	        }else{
	            for(int i = 0; i < str.length(); i++){
	                if(Character.isUpperCase(str.charAt(i))){
	                    f = false;
	                }else{
	                }
	            }
	        }
	    }catch(NullPointerException e){
	        return false;
	    }
	    return f;
    }
}
