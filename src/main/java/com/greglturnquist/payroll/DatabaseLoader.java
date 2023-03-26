/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.greglturnquist.payroll;

import com.sandra.entity.User;
import com.sandra.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author Greg Turnquist
 */
// tag::code[]
@Component // <1>
@AllArgsConstructor
@ComponentScan({  "com.sandra"})
public class DatabaseLoader implements CommandLineRunner { // <2>
	@Autowired
	private final UserRepository userRepository;

	// <3>

	@Override
	public void run(String... strings) throws Exception { // <4>
		this.userRepository.save(User.builder().email("my-wonderdrugs@email.com").password("@123#").build());
	}
}
// end::code[]
