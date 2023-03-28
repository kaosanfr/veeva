
package com.sandra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


// tag::code[]
@SpringBootApplication
public class VeevaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VeevaApplication.class, args);
	}
}
// end::code[]