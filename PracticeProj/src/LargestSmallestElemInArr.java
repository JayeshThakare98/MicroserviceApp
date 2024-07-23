import java.util.Arrays;

public class LargestSmallestElemInArr {
	public static void main(String[] args) {
		System.out.println("Program to print the largest element in an array");
		  int [] arr = new int [] {25, 11, 7, 75, 56}; 
		  int max= arr[0];
		  for(int i =0 ;i<arr.length;i++) {
			  if(max<arr[i]) {
				 max= arr[i];
			  }
		  }
		  System.out.println(max);
		  
			System.out.println("Program to print the largest element in an array Using Stream ");
			
			int maxVal = Arrays.stream(arr).max().orElseThrow(() -> new RuntimeException("Array is empty "));
			System.out.println(maxVal);

			System.out.println("Program to print the Smallest  element in an array");
			 
			  int minv= arr[0];
			  for(int i =0 ;i<arr.length;i++) {
				  if(minv>arr[i]) {
					 minv= arr[i];
				  }
			  }
			  System.out.println(minv);
			  
				System.out.println("Program to print the largest element in an array Using Stream ");
				
				int minVal = Arrays.stream(arr).min().orElseThrow(() -> new RuntimeException("ArrayIs Empty"));
				System.out.println(minVal);

	}

}
