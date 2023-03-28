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
package com.sandra.dummy;

import com.sandra.entity.User;
import com.sandra.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component // <1>
@AllArgsConstructor
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
		//this.userRepository.save(User.builder().email("my-wonderdrugs@email.com").password("@123#").build());
		this.userRepository.save(User.builder().email("totos@email.com").password("123").build());
		// colors

		DummyData.colors.forEach( color ->
				this.colorRepository.save(color)
		);

		DummyData.locations.forEach( color ->
				this.locationRepository.save(color)
		);

		DummyData.siteStatuses.forEach( color ->
				this.siteStatusRepository.save(color)
		);

		DummyData.sites.forEach(color ->
				this.siteRepository.save(color)
		);

		DummyData.studyCountries.forEach( color ->
				this.studyCountryRepository.save(color)
		);

		DummyData.studyList.forEach( color ->
				this.studyRepository.save(color)
		);


	}
}
// end::code[]
