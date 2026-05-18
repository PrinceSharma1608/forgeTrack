package com.tata.Machine.db;

import jakarta.persistence.*;
import lombok.*;

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

    @Column(name = "machine_name")
    private String machineName;

    @Column(name = "area_id")
    private Integer areaId;

    @Column(name = "status")
    private String status;
}
