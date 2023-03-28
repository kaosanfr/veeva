package com.sandra.service;

import com.sandra.dto.SiteDto;
import com.sandra.entity.Site;
import com.sandra.entity.SiteStatus;
import com.sandra.mapper.SiteMapper;
import com.sandra.repository.SiteRepository;
import com.sandra.repository.SiteStatusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SiteService {
    private final SiteRepository siteRepository;

    public List<SiteDto> getListSite() {

        List<SiteDto> sitesDto = new ArrayList<>();
        List<Site> sites =  new ArrayList((Collection) siteRepository.findAll());

        for (Site s:sites) {
            sitesDto.add(SiteMapper.INSTANCE.toSiteDto(s));
        }

        return sitesDto;


    }
}
