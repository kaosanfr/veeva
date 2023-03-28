package com.sandra.controller;

import com.sandra.dto.SiteDto;
import com.sandra.dto.TabSiteDto;
import com.sandra.service.SiteService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MapController {
    private final SiteService siteService;

    @GetMapping(value = "/get/site/colors") // <2>
    public TabSiteDto siteStatuss(Model model) {
        return TabSiteDto.builder().mySites(siteService.getListSite()).build();

    }
}
