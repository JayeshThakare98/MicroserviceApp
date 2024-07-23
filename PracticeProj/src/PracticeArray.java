import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeArray {

	public static void main(String[] args) {

		// Itereting over array
		int a[] = { 33, 3, 4, 5 };
		/*
		 * for(int i : a) { System.out.print(i+1 + " - "); if(i%2==0) {
		 * System.out.println(i); } }
		 */
//	finding the minimum in array 
		findmin(a);
		findmax(a);
// multi diamensional Array  2D Array
		int arr[][] = { { 1, 2, 3 }, { 2, 4, 5 }, { 4, 4, 5 } };

		twoDArray(arr);

//creating array //copying the array 
		int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
		transferingArray(arr1);

//		 finding duplicates in array 
//		int[] arr2 = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3 };
//		findDuplicate(arr2);
//Program to find the frequency of each element in the array
		int[] arr3 = new int[] { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
		findFrequency(arr3);
	}

	private static void findFrequency(int[] arr) {

		Map<Integer, Integer> hMap = new HashMap<>();
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			if (hMap.containsKey(arr[i])) {
				hMap.put(arr[i], hMap.get(arr[i]) + 1);
			} else {
				hMap.put(arr[i], i + 1);
			}
		}

		for (Map.Entry<Integer, Integer> map : hMap.entrySet()) {
			System.out.println(map.getKey() + " - " + map.getValue());
		}
		System.out.println("Using stream ");
		List<Integer> asList = Arrays.asList(1, 2, 8, 3, 2, 2, 2, 5, 1);
		Map<Integer, Long> collect = asList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);

//		 for string 
		List<String> stringList = Arrays.asList("bantai", "Bacchi", "Bamai", "bamai");
		Map<String, Long> collect2 = stringList.stream().map(String::toLowerCase)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect2);

	}

	private static void findDuplicate(int[] arr2) {
		int n = arr2.length;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr2[i] == arr2[j]) {
					System.out.println(arr2[j]);
				}
			}

		}
		System.out.println("Using stream ");
		List<Integer> arr = Arrays.asList(1, 2, 3, 4, 2, 7, 8, 8, 3);
		Set<Integer> set1 = new HashSet<>();

		Set<Integer> collect = arr.stream().filter(i -> !set1.add(i)).collect(Collectors.toSet());
		System.out.println(collect);

	}

	private static void transferingArray(int[] arr1) {
		int[] arr2 = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];

		}
//		printing Array
		for (int i : arr2) {
//			System.out.print(" "+i);
		}

	}

	// finding the minimum in array
	private static void findmin(int[] a) {
		int min = a[0];

		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		// System.out.println(min);
	}

	private static void findmax(int[] a) {
		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
//		System.out.println(max);
	}

	public static void twoDArray(int[][] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
//				System.out.print(arr[i][j]+"*");
			}
//			System.out.println(" ");
		}

//		for(int i : arr) {
//			for(int j :arr) {
//				System.out.println(arr[i][j]);
//			}
//		}
	}

}
