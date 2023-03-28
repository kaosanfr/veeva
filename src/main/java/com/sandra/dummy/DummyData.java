package com.sandra.dummy;

import com.sandra.entity.*;
import lombok.experimental.UtilityClass;

import java.util.List;

@UtilityClass
public class DummyData {

    List<Color> colors = List.of(
            Color.builder().color("#0000FF").build(),
            Color.builder().color("#FF7F50").build(),
            Color.builder().color("#9932CC").build());

    List<Location> locations = List.of(
            Location.builder().locationName("France").countryIso2("FR").build(),
            Location.builder().locationName("Colombia").countryIso2("CO").build(),
            Location.builder().locationName("Japan").countryIso2("jP").build());

    List<SiteStatus> siteStatuses = List.of(
			SiteStatus.builder().colorName(colors.get(0)).statusName("Status1").build(),
			SiteStatus.builder().colorName(colors.get(1)).statusName("Status2").build(),
			SiteStatus.builder().colorName(colors.get(2)).statusName("Status3").build());

	List<Site> sites = List.of(
			Site.builder()
					.siteStatus(siteStatuses.get(0))
					.location(locations.get(0))
					.siteName("Site1").build(),
			Site.builder()
					.siteStatus(siteStatuses.get(1))
					.location(locations.get(1))
					.siteName("Site2").build(),
			Site.builder()
					.siteStatus(siteStatuses.get(2))
					.location(locations.get(2))
					.siteName("Site3").build()
			);

	List<StudyCountry> studyCountries = List.of(
			StudyCountry.builder().name("France").build(),
			StudyCountry.builder().name("Colombia").build(),
			StudyCountry.builder().name("Japan").build());

	List<Study> studyList = List.of(
			Study.builder()
					.studyName("study1")
					.studyCountry(studyCountries.get(0))
					.siteStatus(siteStatuses.get(0)).build(),
			Study.builder()
					.studyName("study2")
					.studyCountry(studyCountries.get(1))
					.siteStatus(siteStatuses.get(1)).build(),
			Study.builder()
					.studyName("study3")
					.studyCountry(studyCountries.get(2))
					.siteStatus(siteStatuses.get(2)).build()
	);
}
