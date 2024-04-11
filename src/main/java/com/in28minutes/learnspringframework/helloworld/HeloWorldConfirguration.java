package com.in28minutes.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {

}

record Address(String firstLine, String city) {
}

@Configuration
public class HeloWorldConfirguration {

	@Bean
	public String name() {
		return "Manav";
	}

	@Bean
	public int age() {
		return 26;
	}

	@Bean
	@Primary
	public Person person() {
		return new Person("Gupta", 27, new Address("Baker Street", "London"));
	}

	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address3());
	}

	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		return new Person(name, age, address3);
	}

	@Bean
	public Person person4Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) {
		return new Person(name, age, address);
	}

	@Bean(name = "address2")
	@Primary
	public Address address() {
		return new Address("Near cinema road", "Sunam");
	}

	@Bean(name = "address3")
	@Qualifier("address3qualifier")
	public Address address3() {
		return new Address("Motinagar", "Hyderabad");
	}

}
