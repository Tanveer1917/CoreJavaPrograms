package com.Stringprograms;

public class TestIndexingPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
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
		        
		        //I want to fetchindex position of c
		        //Indexof(returns the index position of first occurrence
		        
		        int indexOfc=name.indexOf('c');
		        System.out.println(indexOfc);
		        //lastIndexOf
		        
		        int lastIndexofc=name.lastIndexOf('c');
		        System.out.println(lastIndexofc);
		        
		        //index of character sequence
		        int indexOfCyber=name.indexOf("Cyber");
		        System.out.println(indexOfCyber);
		        
		        int indexOfsuccess=name.indexOf("Success");
		        System.out.println(indexOfsuccess);
			}

		


	}


