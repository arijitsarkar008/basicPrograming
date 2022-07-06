package src.main.java;

import java.util.*;

/**
 * 
 * @author Arijit Sarkar
 *
 */
public class Program10 {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();


		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		String rev=sb.toString();

		if(str.equalsIgnoreCase(rev)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
