package com.hcl;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {
        System.out.println( "Hello World! -Tristan" );
        
        for (int i = 0; i < 10; i++) {
        	
        	if (i == 5) {
        		continue;
        	}
        	System.out.println(i);
        }
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter an integer value");
        int j = kb.nextInt();
        kb.close();
        int k = 0;
        while (k < j) {
        	System.out.println(k);
        	k++;
        }
    }
}
