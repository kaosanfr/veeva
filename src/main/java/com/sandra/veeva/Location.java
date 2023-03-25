package com.sandra.veeva;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Location {
    private final double[] lnglat;
    private final String description;

    public double[] getLnglat() {
        return lnglat;
    }

    public String getDescription() {
        return description;
    }

}