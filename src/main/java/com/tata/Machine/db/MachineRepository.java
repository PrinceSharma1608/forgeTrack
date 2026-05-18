package com.tata.Machine.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MachineRepository extends JpaRepository<Machine, Integer> {
    // This interface automatically gives save(), findById(), and delete() methods.
}
