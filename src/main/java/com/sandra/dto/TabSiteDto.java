package com.sandra.dto;

import lombok.*;

import java.io.Serializable;
import java.util.List;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TabSiteDto implements Serializable {
    List<SiteDto> mySites;
}
