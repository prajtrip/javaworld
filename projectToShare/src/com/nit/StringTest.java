package com.nit;

public class StringTest {

	public static void main(String[] args) {
		String string="newstring";
		//covert to char array
		char[] c=string.toCharArray();
		//define an empty string
		String str="";
		for(int i=c.length-1;i>=0;i--)
		{
			str=str+c[i];
		}
		System.out.println(str);

	}

}
