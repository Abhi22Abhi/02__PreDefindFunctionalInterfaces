package abhi.java8.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {


		Function<Integer, Integer> function1 = i-> i = i*i;
		
		Integer applyVar = function1.apply(10);
		System.out.println(applyVar);
		
		
		Function<Integer, Integer> function2 = i-> i = i+1;
		
		List<Integer> list = Arrays.asList(10, 33, 50, 77, 20);
		System.out.println(list);
		System.out.println();
		list.stream()
		.map(function2)
		.forEach(i-> System.out.println(i));
//		.collect(Collectors.toList());
	
	}

}
