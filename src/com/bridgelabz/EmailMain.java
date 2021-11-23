package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailMain {
	
	public static void main(String[] args) {
		
		String emailPattern = "^[a-z]{3}[.][a-z]{3,}[@][a-z]{10}[.][a-z]{2}[.][a-z]{2,}$";
		String emailId = "abc.xyz@bridgelabz.co.in";
		System.out.println(Pattern.matches(emailPattern, emailId));		
	}
	
}
