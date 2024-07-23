package filterMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterDemos {
	public static void main(String[] args) {
		List<Integer> numberList = new ArrayList<>();
//		numberList.add(10);
//		numberList.add(15);
//		numberList.add(16);
//		numberList.add(12);
//		numberList.add(20);
//		numberList.add(25);
//		numberList.add(30);
		numberList= Arrays.asList(10,15,20,25,30);
		//find even number
//		List<Integer> collect = numberList.stream().filter(n -> (n%2==0)).collect(Collectors.toList());
//		 numberList.stream().filter(n -> (n%2==0)).forEach(n ->System.out.println(n));
		 numberList.stream().filter(n -> (n%2==0)).forEach(System.out::println);


		
		
	}

}
