package main.zInterview.code;

import java.security.InvalidParameterException;

public class StringConverter {
	
	public static final long toLong(String s) {
		
		if(s == null || s.length() == 0){
	        throw new InvalidParameterException();
	    }
	
	    int ret = 0;
	
	    boolean isNegtive = false;
	    //remove , if string is like 1,000,000
	    s=s.replace(",", "");
	
	    for(int i=0;i<s.length();i++){
	        char c = s.charAt(i);
	
	        if( i == 0 && (c == '-')){
	            isNegtive = true;
	            continue;
	        }
	
	        if(c - '0' < 0 || c - '0' > 10){
	            throw new InvalidParameterException();
	        }
	
	        int tmp = c - '0';
	
	        ret *= 10;
	        ret += tmp;
	
	    }

	    return isNegtive ? (ret * (-1)) : ret;
	}

}
