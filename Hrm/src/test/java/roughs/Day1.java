package roughs;

import org.testng.annotations.Test;

public class Day1 {
	

	
	public static void main(String[] args)
	{
		String s1=new String("abc");
		String s2="abc";
		String s4="ab"+new String("c");
		String s3="ab"+"c";
		
		System.out.println(s2==s3);
		System.out.println(s4==s2);
		System.out.println(s3);
		
		
	}
}
