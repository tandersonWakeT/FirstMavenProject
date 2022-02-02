package com.hcl;
import java.util.Scanner;
import com.hcl.exception.MyException;

public class MyExceptionDemo {
	
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your name: ");
		
		try {
			String name = kb.nextLine();
			
			if (!Character.isUpperCase(name.charAt(0))) {
				throw new MyException("First character must be uppercase.");
			}
		}
		catch (MyException e) {
			System.out.println(e);
		}
		finally {
			kb.close();
		}
		
	
		
	}
}
