package com.tata.Machine.db;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "machine")

public class Machine {

    public enum MachineStatus {
        ACTIVE,
        UNDER_MAINTENANCE
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "machine_id")
    private Integer machineId;


    @Column(
            name = "machine_name",
            nullable = false
    )
    private String machineName;


    @Column(
            name = "area_id",
            nullable = false
    )
    private Integer areaId;


    @Column(name = "worker_id")
    private Integer workerId;


    @Column(
            name = "maintenance_frequency_days",
            nullable = false
    )
    private Integer maintenanceFrequencyDays;


    @Column(name = "last_maintenance_date")
    private Date lastMaintenanceDate;


    @Column(name = "next_maintenance_date")
    private Date nextMaintenanceDate;


    @Column(name = "days_delayed")
    private Integer daysDelayed;


    @Enumerated(EnumType.STRING)
    @Column(
            name = "status",
            nullable = false
    )
    private MachineStatus status;


    @PrePersist
    public void setDefaultValues() {

        LocalDate today = LocalDate.now();

        this.lastMaintenanceDate = Date.valueOf(today);

        this.nextMaintenanceDate =
                Date.valueOf(
                        today.plusDays(this.maintenanceFrequencyDays)
                );

        this.daysDelayed = 0;

        if (this.status == null) {
            this.status = MachineStatus.ACTIVE;
        }
    }
}