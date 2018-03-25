package com.src.validation;

import java.util.regex.Pattern;

public class Validation1 {
	public static boolean ischar(String input){
		boolean valid=true;
		char[] iparray=input.toCharArray();
		for(char c:iparray){
			if(!Character.isLetter(c))
			{
				valid=false;
				break;
			}
		}
		return valid;
	}
	public static boolean isValidPassword(String input){
		String patternString="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
			Pattern pattern=Pattern.compile(patternString);
		return pattern. matcher(input).matches();
	}
	}


