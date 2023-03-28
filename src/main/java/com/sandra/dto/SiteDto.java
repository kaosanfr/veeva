package com.sandra.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SiteDto implements Serializable {

    private String siteName;

    private String locationName;

    private String locationIso2;
    private String colorName;

    private String statusName;

}
