package com.Junit;

import java.io.IOException;

import java.util.ArrayList;


public class StringHelper {

	public String truncateAInFirst2Positions(String str) {
		if (str.length() <= 2)
			return str.replaceAll("A", "");

		String first2Chars = str.substring(0, 2);
		String stringMinusFirst2Chars = str.substring(2);

		return first2Chars.replaceAll("A", "") 
				+ stringMinusFirst2Chars;
	}

	public boolean areFirstAndLastTwoCharactersTheSame(String str) {

		if (str.length() <= 1)
			return false;
		if (str.length() == 2)
			return true;

		String first2Chars = str.substring(0, 2);

		String last2Chars = str.substring(str.length() - 2);

		return first2Chars.equals(last2Chars);
	}
	public static boolean isItSunny() {
		return true;
	}
	
	public static int findMax(int arr[]){  
        int max=0;  
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
        }  
        return max;  
    }
	public boolean isEvenNumber(int number){
		
		boolean result= false;
		if(number  % 2 == 0 ){
			return true;
		}

		return result;

	}
	public boolean isOddNumber(int number){
		
		boolean result= false;
		if(number  % 3 == 0 ){
			return true;
		}

		return result;

	}

}