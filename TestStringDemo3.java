package com.Stringprograms;

public class TestStringDemo3 {

	public static void main(String[] args) {
	
		String firstName="Abc";
		String city="Kolkata";
		String email="abc@gmail.com";
		String ph="33458550";
		
		//based on the customer details I want to genate OTP number
		
		int indexOfLastCharFromName=firstName.indexOf(firstName.charAt(firstName.length()-1));
		System.out.println(indexOfLastCharFromName);
		//How to convert primitive into String
		
		String s1=String.valueOf(indexOfLastCharFromName);
		
		
		int indexOFMidCharacterFromCity=city.indexOf(city.charAt(city.length()/2));
		System.out.println(indexOFMidCharacterFromCity);
		String s2=String.valueOf(indexOfLastCharFromName);
		String lastTwoCharFromPhone=ph.substring(ph.length()-2);
		String finalOtp=s1.concat(s2).concat(lastTwoCharFromPhone);
		System.out.println("Hi........"+" "+firstName+ " "+"your otp is "+" "+finalOtp);
		
		
	}

}
