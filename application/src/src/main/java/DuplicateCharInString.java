package src.main.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * Probelm statement: Find the Duplicate  character froma string and count its occurence
 *
 */


public class DuplicateCharInString {

	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();
		
		Map<Character,Integer> mp=new HashMap<>();
		char[] chArr=str.toCharArray();
		
		for(char  key  : chArr) {
			if(Character.isAlphabetic(key)) {
				if(mp.containsKey(key)) {
					mp.put(key, mp.get(key)+1);
				}else {
					mp.put(key, 1);
				}
			}
		}
		
		System.out.println(mp); // print the map which countain count for all the char in string
		
		mp.entrySet().removeIf(i -> i.getValue()==1); //  remove the char from map whose value is 1
		
		System.out.println(mp);
		
	}
	
	
	
	

}
