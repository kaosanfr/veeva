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
@Table(name="STUDY")
public class Study implements Serializable {

    @Id
    private String studyName;

    @ManyToOne
    @JoinColumn(name = "siteName", nullable = false)
    private Site site;

    @ManyToOne
    @JoinColumn(name = "name", nullable = false)
    private StudyCountry studyCountry;
}
