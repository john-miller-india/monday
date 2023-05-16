package com.demo.Spring.boot;

import com.demo.Spring.boot.entity.Emplyoee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	public List<Employee> list = new ArrayList<Employee>();
	list.add(new Emplyoee(100, "rakesh", "Male"));
	list.add(new Emplyoee(100, "radhika", "female"));
	list.add(new Emplyoee(100, "mark", "Male"));

	list.stream().sorted(Comparator.comparing(Emplyoee::getName(), Collect(Collectors.toList())));

}
