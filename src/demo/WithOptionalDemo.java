package demo;

import java.util.Optional;

public class WithOptionalDemo {

	public static void main(String[] args) {
		Person person = new Person();
		Optional<Address> address = person.getAddress();
		address.ifPresent(a -> System.out.println(a));
	}

}
