package com.Stringprograms;

public class TestStringDemo1 {
	public static void main(String[] args) {
		String s1 = "Ravi";
		String s2=new String("Ravi");
		/*String s2 = "Ravi";
		String s3 = "Tavi";*/

		System.out.println(s1.hashCode() + " " + s2.hashCode());
		if (s1 == s2)
		{
			System.out.println("both refenece are same ");
		} else {
			System.out.println("not same");
		}

	}

}
