package com.example.GTICSLAB420201497.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    @Column(name = "employee_id", nullable = false)
    private Integer employeeId;
    @Id
    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate;
    @Column(name = "end_date", nullable = false)
    private LocalDateTime endDate;
    @Column(name = "job_id", nullable = false)
    private Integer jobId;
    @Column(name = "department_id")
    private Integer departmentId;

}
