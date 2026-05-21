package com.tata.Machine.db;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "machine")

public class Machine {

    @Id
    @Column(name = "machine_id")
    private Integer machineId;


    @Column(name = "machine_name",
            nullable = false)
    private String machineName;


    @Column(name = "area_id",
            nullable = false)
    private Integer areaId;


    @Column(name = "worker_id",
            unique = true,
            nullable = false)
    private Integer workerId;


    @Column(name = "maintenance_frequency_days",
            nullable = false)
    private Integer maintenanceFrequencyDays;


    @Column(name = "last_maintenance_date")
    private Date lastMaintenanceDate;


    @Column(name = "status",
            nullable = false)
    private String status;
}