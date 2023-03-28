package com.sandra.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name="SITE")
public class Site implements Serializable {
    @Id
    private String siteName;

    @ManyToOne
    @JoinColumn(name = "locationName", nullable = false)
    private Location location;

    @ManyToOne
    @JoinColumn(name = "statusName", nullable = false)
    private SiteStatus siteStatus;


}
