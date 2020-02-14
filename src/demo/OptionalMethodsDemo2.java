package demo;

import java.time.LocalDate;
import java.util.Optional;

public class OptionalMethodsDemo2 {

	public static void main(String[] args) {
		Optional<Integer> opNum = Optional.ofNullable(5);
		Integer num = opNum.orElse(10);
		System.out.println("Value: " + num);
		Optional<Integer> opNum1 = Optional.ofNullable(null);
		Integer num1 = opNum1.orElse(10);
		System.out.println("Value: " + num1);
		Optional<LocalDate> opDate = Optional.of(LocalDate.of(2015, 12, 18));
		LocalDate date = opDate.orElseGet(() -> LocalDate.now());
		System.out.println("Date: " + date);
		Optional<LocalDate> opDate1 = Optional.ofNullable(null);
		LocalDate date1 = opDate1.orElseGet(() -> LocalDate.now());
		System.out.println("Date: " + date1);
		Optional<Double> opDouble = Optional.ofNullable(4.5);
		double doubleValue = opDouble.orElseThrow(RuntimeException::new);
		System.out.println("DoubleValue: " + doubleValue);
		Optional<Double> opDouble1 = Optional.ofNullable(null);
		double doubleValue1 = opDouble1.orElseThrow(RuntimeException::new);
		System.out.println("DoubleValue: " + doubleValue1);
	}

}
