package demo;

import java.util.Optional;

public class Person {
	
	private String name;
	private int age;
	private Optional<Address> address = Optional.ofNullable(null);
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Optional<Address> getAddress() {
		return address;
	}
	
	public void setAddress(Optional<Address> address) {
		this.address = address;
	}

}
