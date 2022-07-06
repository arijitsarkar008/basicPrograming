package src.main.java;

import java.util.*;

/**
 * 
 * @author Arijit Sarkar
 *
 */
public class Program1 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		String str1=sc.nextLine();
		//String str2=sc.nextLine();
		sc.close();
		String str2=str1.replaceAll("7","");
		String res=str2.replaceAll("56", "");
		System.out.println(res);
		
	}
}
