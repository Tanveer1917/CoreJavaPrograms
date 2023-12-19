package com.Stringprograms;

public class TestAcquiDemo6 {
	
	public static void main(String[] arge)
	{
		String str="ABC";
		byte[] b=str.getBytes();
		for(byte b1:b)
		{
			String s=" "+b1;
			System.out.print(s);
			
		}
		
	}

}
