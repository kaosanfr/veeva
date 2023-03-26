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
@Table(name="SITE_STATUS")
public class SiteStatus implements Serializable  {
    @Id
    private String statusName;

    @ManyToOne
    @JoinColumn(name = "color", nullable = false)
    private Color colorName;

}
