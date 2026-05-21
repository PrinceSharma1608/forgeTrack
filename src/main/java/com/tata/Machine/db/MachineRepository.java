package com.tata.Machine.db;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MachineRepository extends JpaRepository<Machine, Integer> {
    // This interface automatically gives save(), findById(), and delete().
    @Query(
            value =
                    "SELECT * FROM W_M_map()",
            nativeQuery = true
    )
    List<Object[]> getWorkerMachineMap();
    @Query(
            value =
                    "SELECT * FROM overdue_machine_worker_map()",
            nativeQuery = true
    )

    List<Object[]> getOverdueMachines();
    @Query(
            value =
                    "SELECT * FROM maintenance_done_today()",
            nativeQuery = true
    )

    List<Object[]> getTodayMaintenance();
    @Modifying
    @Transactional

    @Query(
            value =
                    "SELECT cleanup()",
            nativeQuery = true
    )

    void cleanupHistory();
}
