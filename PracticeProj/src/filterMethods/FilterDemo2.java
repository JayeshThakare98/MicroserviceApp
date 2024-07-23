package filterMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
	public static void main(String[] args) {
		// filter the name in such way that the name is greter than 6 and less than 8
		List<String> nameList = Arrays.asList("bob", "asdf", "ijuhgfds", "sdfghjklkjhgfc", "wsedfg", "qw", "kjhgfd",
				"1234567");

		List<String> longname = nameList.stream().filter(str -> str.length() > 6 && str.length() < 8)
				.collect(Collectors.toList());
		System.out.println(longname);
		System.out.println("By using ForEach");
		nameList.stream().filter(str -> str.length() > 6 && str.length() < 8).forEach(str -> System.out.println(str));
		System.out.println("By using Method Refferance");
		nameList.stream().filter(str -> str.length() > 6 && str.length() < 8).forEach(System.out::println);
	}

}
