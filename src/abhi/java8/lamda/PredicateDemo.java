package abhi.java8.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		/*
		Predicate<Integer> predicate = i -> {
			if(i % 2 == 0) {
				return true;	
			}else {
				return false;
			}
		};
		System.out.println(predicate.test(20));
	*/
		
		Predicate<Integer> predicateRef = i -> i % 2 == 0; //JVM understand because of Predicate concept
		System.out.println(predicateRef.test(20));
		System.out.println(predicateRef.test(29));
		
//		int x = 10;
//		x % 2 == 0;
		System.out.println();
		
		// filter(predicate)
		List<Integer> list = Arrays.asList(10, 33, 50, 77, 20);
		System.out.println(list);
		
		list.stream()
//		.filter(predicateRef)
		.filter(i -> i%2 == 0)
		.forEach((i) -> System.out.println(i));
//		.collect(Collectors.toList());
		
		// Same for Remaining Functional Interfaces. 
	}

}
