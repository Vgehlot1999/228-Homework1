package edu.iastate.cs228.hw01;

/**
 * 
 * @author Vismay
 *
 */

public class MyString
{
	private char[] chars;

	public MyString(char[] chars)
	{
		if(chars == null || chars.length == 0) throw new IllegalArgumentException();
		
		this.chars = chars;
	}

	//https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#length--
	public int length()
	{
		return chars.length;
	}
	
	//https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#charAt-int-
	public char charAt(int index)
	{
		return chars[index];
	}

	// https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#substring-int-int-
	public MyString substring(int begin, int end)
	{
		int x = end - begin;
		char[] list = new char[x];
		for (int i = 0; i < x; i++)
		{
			list[i] = chars[begin + i];
		}
		return new MyString(list);
	}

	//It is ok to use
	//https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html#toLowerCase-char-
	public MyString toLowerCase()
	{
		char[] list = new char[chars.length];
		for (int i = 0; i < list.length; i++)
		{
			list[i] = Character.toLowerCase(chars[i]);
		}
		return new MyString(list);
		
	}

	
	//You can assume only positive values.
	//https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#valueOf-int-
	public static MyString valueOf(int i)
	{
		int length = 0;
		int j = i;
		while (j != 0)
		{
			j = j/10;
			length++;
		}
		char[] list = new char[length];
		
		j = i;
		
		for (int k = length - 1; k >= 0; k--)
		{
			list[k] = (char)((j % 10) + 48);
			j = j / 10;
		}
		return new MyString(list);
	}

	public char[] toCharArray()
	{
		return chars;
	}
}