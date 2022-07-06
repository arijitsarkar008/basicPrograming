package src.main.java;

import java.io.IOException;
import java.util.Scanner;

/**
 * Minimum steps to make product equal to one
 * 
 * Input:
N = 3
arr[] = {-2, 4, 0}
Output:
5
Explanation:
We can change -2 to -1, 0 to -1 and 4 to 1.
So, a total of 5 steps are required
to update the elements such that
the product of the final array is 1.
 * 
 * 
 * 
 * Input:
N = 3
arr[] = {-1, 1, -1} 
Output :
0
Explanation:
Product of the array is already 1.
So, we don't need to change anything.


 * @author Arijit Sarkar
 *
 */


public class DynamicProgramming1 {
	
	public static void main(String  args[]) throws  IOException{
		
		int N=0;
		int arr[];
		Scanner sc =new Scanner(System.in);
		try {
		 N= sc.nextInt();
		
//		List<Integer>  ls=new ArrayList<Integer>();
		
		
		
		arr= new int[N];
		
		for(int i=0; i<N; i++) {
			int a=sc.nextInt();
//			ls.add(a);
			arr[i]=a;
			
		}
		}finally {
			sc.close();
		}
		
		Solution ob =new Solution();
		
		int ans =ob.makeProductOne(arr, N);
		
		System.out.println("Answer is::::::::::::::::::::::::::"+ans);
		
	}

}

//User function Template for Java

class Solution {
    static int makeProductOne(int[] arr, int N) {
        // code here
        
        int ans=0, zero=0,negs=0;
        
        for(int i=0; i<N;i++){
            
          if(arr[i]<0){
              negs++;
          }
          
          if(arr[i]==0){
              zero++;
          }
          else if(arr[i]>0){
              ans+=arr[i]-1;
          }
          else{
              ans+=(-1)-arr[i];
          }
        }
        
        ans+=zero;
        
        if(negs%2!=0 && zero==0){
            ans+=2;
        }
         
         return ans;
    }
};
