package abhi.java8.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		
		Consumer<Integer> consumer = input -> {
			System.out.println("Given Input is :"+input);
		};
//		consumer.accept(20); // consumer.accept(20); ==> Here we are calling externally.

		
		// filter(predicate)
		List<Integer> list = Arrays.asList(10, 33, 50, 77, 20);
		System.out.println(list);
		
		list.stream()
		.filter(i -> i%2 == 0)
		.forEach(consumer); // consumer.accept(input); ==> Here JVM is calling internally.
//		.forEach((i) -> System.out.println(i));

		
		//		.collect(Collectors.toList());	
//		 Same for Remaining Functional Interfaces. 
	}

}
