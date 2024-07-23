import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToPrintDuplicateElem {
//	Program to print the duplicate elements of an array
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
//		by using Stream 
		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 2, 7, 8, 8, 3);
		HashSet<Integer> hSet = new HashSet<>();

		Set<Integer> collect = asList.stream().filter(i -> !hSet.add(i)).collect(Collectors.toSet());
//		                            arr.stream().filter(i -> !set1.add(i)).collect(Collectors.toSet());
		System.out.println(collect);
	}
}
