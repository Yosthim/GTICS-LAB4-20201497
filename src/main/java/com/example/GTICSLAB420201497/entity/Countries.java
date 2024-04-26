package com.example.GTICSLAB420201497.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "countries")
public class Countries {
    @Id
    @Column(name = "country_id", nullable = false)
    private String countryId;
    @Column(name = "country_name")
    private String countryName;
    @Column(name = "region_id")
    private Double regionId;
}
