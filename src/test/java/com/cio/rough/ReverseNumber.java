package com.cio.rough;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 7862;
		int reversedNum = 0;

		while (num != 0) {
			int digit = num % 10; // Get the last digit
			System.out.println(digit);
			reversedNum = reversedNum * 10 + digit; // Add the digit to the reversed number
			System.out.println("The Reversed Number is " + reversedNum);
			num = num / 10;
			System.out.println("To loop " + num); // Remove the last digit from the original number
		}

		System.out.println("Reversed number: " + reversedNum); // Output: 2687


		String OriginalString = "Automation";

		StringBuilder ReversedString = new StringBuilder(OriginalString).reverse();

		System.out.println(ReversedString.toString());


		String str = "programrming";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (str.indexOf(c) != str.lastIndexOf(c)) {
				if(str.indexOf(c) == i){ //print once per letter.
					System.out.println("Letter '" + c + "' repeats.");
				}
			}
		}


		String word = "Amazon";

		int count = 0;

		for(int j=0;j<word.length();j++) {
			
			System.out.println();

			if(word.charAt(j)=='a' || word.charAt(j)=='A') {

				count = count+1; 
			}
			
		}

		System.out.println(count);
	   }
		
	}

