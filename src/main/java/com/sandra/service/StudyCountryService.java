package com.sandra.service;

import com.sandra.dto.StudyCountryDto;
import com.sandra.entity.Site;
import com.sandra.entity.StudyCountry;
import com.sandra.mapper.SiteMapper;
import com.sandra.repository.StudyCountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudyCountryService {
    private final StudyCountryRepository studyCountryRepository;

    public List<StudyCountryDto> getStudyCountry() {

        List<StudyCountryDto> sitesDto = new ArrayList<>();
        List<StudyCountry> sites =  new ArrayList((Collection) studyCountryRepository.findAll());

        for (StudyCountry s:sites) {
            sitesDto.add(SiteMapper.INSTANCE.toStudyCountryDto(s));
        }

        return sitesDto;


    }
}
