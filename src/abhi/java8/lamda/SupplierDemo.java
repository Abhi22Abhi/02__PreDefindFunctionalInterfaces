package abhi.java8.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		
		Supplier<Integer> supplier  = ()-> 12;
		Integer inputValue = supplier.get();
		System.out.println(inputValue);
		
	
		List<Integer> list = Arrays.asList(10, 33, 50, 77, 20);
		System.out.println(list);
		
		Integer orElseValue = list.stream()
		.findAny()
		.orElse(inputValue);
		
		System.out.println(orElseValue);
	}
}
