package com.tata.Machine.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AreaRepository
        extends JpaRepository<Areas, Integer> {

    @Query(
            value =
                    "SELECT * FROM area_supervisor_map()",
            nativeQuery = true
    )

    List<Object[]> getAreaSupervisorMap();
}