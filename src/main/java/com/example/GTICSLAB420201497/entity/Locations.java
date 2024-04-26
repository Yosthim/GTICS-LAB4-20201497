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
@Table(name = "locations")
public class Locations {
    @Id
    @Column(name = "location_id", nullable = false)
    private Integer locationId;
    @Column(name = "street_address")
    private String streetAddress;
    @Column(name = "postal_code")
    private String postalCode;
    @Column(name = "city", nullable = false)
    private String city;
    @Column(name = "state_province")
    private String stateProvince;
    @Column(name = "country_id")
    private Integer countryId;
}
