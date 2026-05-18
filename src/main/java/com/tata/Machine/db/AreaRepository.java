package com.tata.Machine.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaRepository extends JpaRepository<Areas, Integer> {

}