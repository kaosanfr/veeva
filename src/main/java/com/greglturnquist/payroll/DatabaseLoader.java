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

import com.sandra.entity.Color;
import com.sandra.entity.Location;
import com.sandra.entity.SiteStatus;
import com.sandra.entity.User;
import com.sandra.repository.*;
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
	@Autowired
	private final ColorRepository colorRepository;

	@Autowired
	private final LocationRepository locationRepository;

	@Autowired
	private final SiteRepository siteRepository;

	@Autowired
	private final SiteStatusRepository siteStatusRepository;

	@Autowired
	private final StudyCountryRepository studyCountryRepository;

	@Autowired
	private final StudyRepository studyRepository;

	@Override
	public void run(String... strings) throws Exception { // <4>
		this.userRepository.save(User.builder().email("my-wonderdrugs@email.com").password("@123#").build());
		// colors
/*		this.colorRepository.save(Color.builder().name("#0000FF").build());
		this.colorRepository.save(Color.builder().name("#FF7F50").build());
		this.colorRepository.save(Color.builder().name("#9932CC").build());

		// Locations
		this.locationRepository.save(Location.builder().name("France").build());
		this.locationRepository.save(Location.builder().name("Colombia").build());
		this.locationRepository.save(Location.builder().name("Japan").build());

		// Site Status
		this.siteStatusRepository.save(SiteStatus.builder().statusName("Status1").colorName(Color.builder().name("#0000FF").build()).build());
		this.siteStatusRepository.save(SiteStatus.builder().statusName("Status2").colorName(Color.builder().name("#FF7F50").build()).build());
		this.siteStatusRepository.save(SiteStatus.builder().statusName("Status3").colorName(Color.builder().name("#9932CC").build()).build());

		// Site
*/
	}
}
// end::code[]
