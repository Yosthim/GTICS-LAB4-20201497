package com.example.GTICSLAB420201497.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "departments")
public class Departments {
    @Id
    @Column(name = "department_id", nullable = false)
    private Integer departmentId;
    @Column(name = "department_name", nullable = false)
    private String departmentName;
    @Column(name = "manager_id")
    private Integer managerId;
    @Column(name = "location_id")
    private Integer locationId;
}
