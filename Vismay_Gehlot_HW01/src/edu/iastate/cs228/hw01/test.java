package edu.iastate.cs228.hw01;

import java.math.BigInteger;

/**
 * 
 * @author Vismay
 *
 */

public class test 
{
//	public static void main(String[] args)
//	{
//		MyString s = new MyString(new char[] {'a', 'b', 'c'});
//		System.out.println(s.length());
//		System.out.println(s.charAt(1));
//		System.out.println(s.equals(new MyString(new char[] { 'a', 'b', 'c' })));
//		
//		char[] chars = MyString.valueOf(345).toCharArray();
//		for (int i = 0; i < chars.length; i++)
//		{
//			System.out.print(chars[i]);
//		}
//	}
	
	public static void main(String[] args)
	{
		Rational2 r1 = new Rational2(new BigInteger("1"), new BigInteger("2"));
		Rational2 r2 = new Rational2(new BigInteger("1"), new BigInteger("2"));
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r1.divide(r2));
		System.out.println(r1.multiply(r2));
		System.out.println(r1.add(r2));
		System.out.println(r1.subtract(r2));
		System.out.println(r1.intValue());
		System.out.println(r1.longValue());
		System.out.println(r1.doubleValue());
		System.out.println(r1.equals(r2));
		
	}

}
