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
@Table(name = "regions")
public class Regions {
    @Id
    @Column(name = "region_id", nullable = false)
    private Double regionId;
    @Column(name = "region_name")
    private String regionName;
}
