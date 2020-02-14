package demo;

import java.util.Optional;

public class OptionalCreationDemo {

	public static void main(String[] args) {
		Optional<Integer> opInt = Optional.empty();
		Optional<String> opStr = Optional.of("Hello World");
		Optional<String> opStr1 = Optional.ofNullable("Hello World");
		Optional<String> opStr2 = Optional.ofNullable(null);
	}

}
