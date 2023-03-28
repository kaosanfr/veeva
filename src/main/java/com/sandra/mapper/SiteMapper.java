package com.sandra.mapper;

import com.sandra.dto.SiteDto;
import com.sandra.entity.Site;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SiteMapper {
    SiteMapper INSTANCE = Mappers.getMapper(SiteMapper.class);

    @Mapping(target = "siteName", source = "site.siteName")
    @Mapping(target = "locationName", source = "site.location.locationName" )
    @Mapping(target = "locationIso2", source = "site.location.countryIso2" )
    @Mapping(target = "colorName", source = "site.siteStatus.colorName.color" )
    @Mapping(target = "statusName", source = "site.siteStatus.statusName" )
    SiteDto toSiteDto(Site site);
}
