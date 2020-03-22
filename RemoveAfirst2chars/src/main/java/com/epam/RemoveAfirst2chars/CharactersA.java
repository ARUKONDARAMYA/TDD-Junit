package com.epam.RemoveAfirst2chars;
public class CharactersA {
	public String remove(String string) {
		int strlen=string.length();
		String str=null;
	    if(string.charAt(0)=='A'||string.charAt(1)=='A'){
	    	if (string.charAt(0)=='A'&&string.charAt(1)=='A'){
	    		str=string.substring(2, strlen);
	    	}
	    	else if(string.charAt(0)=='A'){
	    		str=string.substring(1,strlen);
	    	}
	    	else 
	    		{
	    		if(string.charAt(1)=='A'){
	    		StringBuilder build=new StringBuilder(string);
	    		build.deleteCharAt(1);
	    		str=build.substring(0)+build.substring(2, strlen-2);
	    	}
	    		}
	    	return str;
 }
	    return string;
  }
	
}