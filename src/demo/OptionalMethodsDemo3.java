package demo;

import java.util.Optional;

public class OptionalMethodsDemo3 {

	public static void main(String[] args) {
		Optional<String> opStr = Optional.ofNullable("Hello World");
		Optional<String> result = opStr.filter(str -> str.startsWith("Hello"));
		System.out.println("Result is present: " + result.isPresent());
		System.out.println("Result: " + result.get());
		Optional<String> result1 = opStr.filter(str -> str.startsWith("World"));
		System.out.println("Result is present: " + result1.isPresent());
		Optional<String> opStr1 = Optional.ofNullable(null);
		Optional<String> result2 = opStr1.filter(str -> str.startsWith("Hello"));
		System.out.println("Result is present: " + result2.isPresent());
		Optional<Integer> opNum = Optional.ofNullable(5);
		Optional<Double> doubleResult = opNum.map(num -> num * 2.5);
		System.out.println("Result is present: " + doubleResult.isPresent());
		System.out.println("Result: " + doubleResult.get());
		Optional<Integer> opNum1 = Optional.ofNullable(null);
		Optional<Double> doubleResult1 = opNum1.map(num -> num * 2.5);
		System.out.println("Result is present: " + doubleResult1.isPresent());
	}

}
