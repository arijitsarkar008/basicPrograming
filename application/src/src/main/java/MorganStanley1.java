package src.main.java;

import java.util.HashMap;
import java.util.Scanner;

public class MorganStanley1 {
	
	public static void main(String args[]) {
		
		Scanner sc =new Scanner(System.in);
		String str="";
		try {
			str=sc.nextLine();
		}finally {
			sc.close();
		}
		HashMap<String,String> mp= new HashMap<String, String>();
		mp.put("Ajay", "Ramesh");
		mp.put("Deepesh", "Animesh");
		mp.put("Mohan", "Ajay");
		mp.put("Rahul", "Mohan");
		
		String res= sortHierarchy(mp,str);
		System.out.println("Answer is:::::::::::::"+res);
	}
	
	public static String sortHierarchy(HashMap<String,String> mp, String str) {
		String res=str;
		
		for(int i=0; i<mp.size(); i++) {
			if(mp.containsKey(str)) {
				res+="->"+mp.get(str);
				str=mp.get(str);
			}
		}
		
		return res;
	}

}
