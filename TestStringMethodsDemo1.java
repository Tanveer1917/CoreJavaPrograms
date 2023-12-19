package com.Stringprograms;

public class TestStringMethodsDemo1 {

	public static void main(String[] args) {
		String name="Cyber Success";
		//I want length of string
		int size=name.length();
		System.out.println(size);
		//I want fetch first character from given string
		char firstChar=name.charAt(0);
		System.out.println(firstChar);
		
		//I wantt fetch last character from given String
        char lastChar=name.charAt(name.length()-1);
        System.out.println(lastChar);
	}

}
