package src.main.java;

/**
 * 
 * java code for bubble sort
 * 
 * Worst case Time Complexity = O(n^2)
 *
 */
public class BubbleSort {
	
	public static void main(String args[]) {
		
		int arr[]= {6,3,9,5,2,8};
		
		int n= arr.length;
		bubbleSort(arr, n-1);
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void bubbleSort(int arr[], int n) {
	
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}

}
