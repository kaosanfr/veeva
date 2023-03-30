package com.sandra.controller;

import com.sandra.dto.SiteDto;
import com.sandra.dto.StudyCountryDto;
import com.sandra.dto.TabSiteDto;
import com.sandra.entity.StudyCountry;
import com.sandra.service.SiteService;
import com.sandra.service.StudyCountryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@Slf4j
public class MapController {
    private final SiteService siteService;

    private final StudyCountryService studyCountryService;

    @GetMapping(value = "/api/site/colors")
    @CrossOrigin(origins = {"http://localhost:8082", "http://localhost:8080"})
    public List<SiteDto> siteStatuss(Model model) {
        log.info("Hello");
        return siteService.getListSite();

    }

    @GetMapping(value = "/api/study/countries")
    @CrossOrigin(origins = {"http://localhost:8082", "http://localhost:8080"})
    public List<StudyCountryDto> studyCountries(Model model) {
        return studyCountryService.getStudyCountry();

    }

}
