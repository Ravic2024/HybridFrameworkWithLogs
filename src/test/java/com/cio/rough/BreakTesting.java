package com.cio.rough;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public class BreakTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		boolean finished = false;
		for(int i =1;i<=10 && !finished;i++) {
			for(int j=1;j<=7;j++) {
				
				System.out.println(i+","+j);
				if(j==5) {
					finished = true;
					break;				
				}		
				
			}
		}

	
    

	        String input = "CIO-IS-176352";
	        String[] parts = input.split("-");
	        
	        System.out.println(parts.length);

	        if (parts.length > 2) {
	            String number = parts[2]; // The number is at index 2
	            System.out.println(number);
	        } else {
	            System.out.println("Invalid input format.");
	        }
	        
	        
	        
	        int lastIndex = input.lastIndexOf("-");

	        if (lastIndex != -1 && lastIndex < input.length() - 1) {
	            String number = input.substring(lastIndex + 1);
	            System.out.println(number);
	        } else {
	            System.out.println("Invalid input format.");
	        }
	
	        
	        String number = StringUtils.substringAfterLast(input, "-");
	        System.out.println(number);
	        
	        String input1 = "23m-IS-176352";
	        Pattern pattern = Pattern.compile("\\d+$"); // Matches digits at the end
	        Matcher matcher = pattern.matcher(input1);

	        if (matcher.find()) {
	            String numbers = matcher.group();
	            System.out.println(numbers);
	        } else {
	            System.out.println("Number not found.");
	        }
	}
}
