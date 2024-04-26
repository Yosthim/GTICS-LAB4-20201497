package com.example.GTICSLAB420201497.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "job_history")
public class JobHistory {
    @Id
    @Column(name = "job_history_id", nullable = false)
    private Integer jonHistoryId;
    @Id
    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employees employee;
    @Id
    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate;
    @Column(name = "end_date", nullable = false)
    private LocalDateTime endDate;
    @ManyToOne
    @JoinColumn(name = "job_id", nullable = false)
    private Jobs job;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Departments department;

}
