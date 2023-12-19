
package com.Stringprograms;

/*Create a password for user like.
 * 
 *8147117572
 *last two character from your name
 *Ravi
 
 */

public class TestHomeworkDemo5
{
	public static void main(String[] args)
	{
		long  ph=8147117572l;
		String name="Ravi";
		String firsttwo=String.valueOf(ph).substring(0,2);
		String midtwoString=name.substring(name.length()-2).toUpperCase();
		String Lasttwo=String.valueOf(ph).substring(String.valueOf(ph).length()-2);
		
		String password = firsttwo.concat(midtwoString).concat(Lasttwo);
		System.out.println("Password"+password);
		
		
	}

}
