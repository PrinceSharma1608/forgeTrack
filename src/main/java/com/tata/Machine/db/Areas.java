package com.tata.Machine.db;

import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="areas")
public class Areas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "area_id")
    private Integer areaId;

    @Column(name = "area_name", unique = true, nullable = false)
    private String areaName;

    @Column(name = "supervisor_id")
    private Integer supervisorId;
}

