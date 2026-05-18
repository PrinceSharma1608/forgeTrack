package com.tata.Machine.db;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "part")

public class Part {
    public enum MaintenanceFrequency {
        DAILY,
        WEEKLY,
        CUSTOM
    }

    public enum Priority {
        LOW,
        MEDIUM,
        HIGH
    }

    public enum CurrentStatus {
        PENDING,
        DONE,
        UNDER_MAINTENANCE
    }

    @Id
    @Column(name = "part_id")
    private Integer partId;

    @Column(name = "machine_id", nullable = false)
    private Integer machineId;

    @Column(name = "part_name", nullable = false)
    private String partName;

    @Enumerated(EnumType.STRING)
    @Column(name = "maintenance_frequency")
    private MaintenanceFrequency maintenanceFrequency;

    @Column(name = "custom_interval_days")
    private Integer customIntervalDays;

    @Column(name = "last_maintenance_date")
    private LocalDate lastMaintenanceDate;

    @Column(name = "next_maintenance_date")
    private LocalDate nextMaintenanceDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "priority")
    private Priority priority;

    @Enumerated(EnumType.STRING)
    @Column(name = "current_status")
    private CurrentStatus currentStatus;
}