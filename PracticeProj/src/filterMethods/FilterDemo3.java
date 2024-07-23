package filterMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {
	public static void main(String[] args) {
		// collection is having null vslue and we have to remove that value 
		List<String> nameList = Arrays.asList("bob", "asdf", "ijuhgfds",null, "sdfghjklkjhgfc", "wsedfg", "qw", "kjhgfd",
				"1234567",null);
		
		List<String> l1 = nameList.stream().filter(str -> str!=null).collect(Collectors.toList());
		System.out.println(l1);
		
		System.out.println("by using for each ");
		
		nameList.stream().filter(str -> str!=null).forEach(str -> System.out.println(str));
		System.out.println("by using Method Refferance ");
		
		nameList.stream().filter(str -> str!=null).forEach(System.out::println);
		
	}

}
