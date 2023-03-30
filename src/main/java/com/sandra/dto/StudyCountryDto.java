package com.sandra.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudyCountryDto implements Serializable {

    private String countryName;
}
