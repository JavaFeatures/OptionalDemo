package demo;

import java.util.Optional;

public class OptionalMethodsDemo {

	public static void main(String[] args) {
		Optional<String> opStr = Optional.ofNullable("Hello World");
		System.out.println("Present: " + opStr.isPresent());
		Optional<String> opStr1 = Optional.ofNullable(null);
		System.out.println("Present: " + opStr1.isPresent());
		Optional<String> opStr2 = Optional.ofNullable("Good Morning");
		String value = opStr2.get();
		System.out.println("Value: " + value);
		Optional<String> opStr3 = Optional.ofNullable("Good Evening");
		opStr3.ifPresent(str -> System.out.println("Value using ifPresent: " + str));
		Optional<String> opStr4 = Optional.ofNullable(null);
		opStr4.ifPresent(str -> System.out.println("Value using ifPresent: " + str));
	}

}
