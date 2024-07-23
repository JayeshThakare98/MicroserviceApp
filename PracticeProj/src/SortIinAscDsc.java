import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SortIinAscDsc {
	public static void main(String[] args) {
		System.out.println("Sort in ascending order ");
		   int [] arr = new int [] {5, 2, 8, 7, 1,1,2,5};     
		   int temp =0 ; 
//		   for(int i=0 ; i<arr.length;i++) {
//			   for(int j=0 ; j<arr.length-1;j++) {
//				   if(arr[i]<arr[j]) {
//					   temp = arr[i];
//					   arr[i] = arr[j];
//					   arr[j]=temp;
//							   
//				   }
//			   }
//		   }
//		   for(int i=0; i <arr.length;i++) {
//			   System.out.print(arr[i]+" ");
//		   }
//		   System.out.println();
//			System.out.println("Sort in ascending order using Stream ");
//		Set<Integer> setIntegers = new HashSet<>();
//		List<Integer> asList = Arrays.asList(5, 2, 8, 7, 1);
//		asList.stream().filter(m -> setIntegers.add(m)).collect(Collectors.toSet()).forEach(System.out::print);
//		
//		System.out.println();
//		System.out.println("Sort in descending order ");
//		
//		for(int i =0 ;i<arr.length;i++) {
//			for(int j=0 ; j<arr.length-1;j++) {
//				if(arr[i]>arr[j]) {
//					temp =arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		for(int i=0; i <arr.length;i++) {
//			   System.out.print(arr[i]+" ");
//		   }
		System.out.println("to print unique number from arr");
		int [] a = new int [] {15, 12, 18, 17, 11,11,12,15}; 
		Set<Integer> setIntegers1 = new TreeSet<>();
//		for(int i = 0 ;i<a.length;i++) {
//			for(int j=i+1; j<a.length;j++) {
//				if(a[i]>a[j]) {
//					temp = a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//			
//		}
//		
		
		for(int i=0; i <a.length;i++) 
			setIntegers1.add(a[i]);
//			   System.out.print(a[i]+" ");
		   
		System.out.println(setIntegers1);

	}

}
