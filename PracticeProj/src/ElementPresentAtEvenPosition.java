import java.util.Arrays;
import java.util.List;

public class ElementPresentAtEvenPosition {

//	Program to print the elements of an array present on even position
//	Elements of given array present on even position:
//		2 , 4
//	
	
//	program to find Even value 

	public static void main(String[] args) {
		System.out.println("program to find Even positions ");
		int[] arr = new int[] { 1, 2, 3, 4, 5,16 };
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("program to find Even position Using Stream ");
//	Using Stream 
		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5,16);
		l1.stream().filter(i -> (i % 2 == 0)).forEach(System.out::println);
	
		System.out.println("even Values are");
		
		for(int i=0 ;i<n;i++) {
			if(arr[i]%2 ==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
//		By using Stream 
		System.out.println("By using Stream Even values are ");
//		Arrays.asList(arr).stream().filter(i -> (i % 2 == 0)).forEach(System.out::println);
		Arrays.stream(arr).filter(a -> a % 2 == 0).forEach(System.out::println);

	}
	
}
