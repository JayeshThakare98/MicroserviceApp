
public class ArrayPracRotetateElement {
//	Program to left rotate the elements of an array with k 
	public static void main(String[] args) {
		 int [] arr = new int [] {1, 2, 3, 4, 5}; 
		 
		  for (int i = 0; i < arr.length; i++) {  
	            System.out.print(arr[i] + " ");  
	        }  
		  
		
		 int k = 3 ;
		 int n = arr.length;
		 for(int i = 0; i < k; i++) {
			 int m , first;
			 first= arr[0];
			 
		  for(m =0 ;m<n-1;m++) {
			  arr[m] = arr[m+1];  
		  }
		  arr[m] = first;  
		 }
		 System.out.println();
		 for (int i = 0; i < arr.length; i++) {  
	            System.out.print(arr[i] + " ");  
	        }  
		  
		 
	}

}
