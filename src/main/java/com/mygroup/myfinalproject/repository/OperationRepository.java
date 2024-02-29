package com.mygroup.myfinalproject.repository;

import com.mygroup.myfinalproject.entity.Operations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface OperationRepository extends JpaRepository<Operations, Long> {

    @Query(value = "SELECT * FROM OPERATIONS WHERE date >= :from and  date<= :to", nativeQuery = true)
    List<Operations> findOperationsBetweenDates(LocalDate from, LocalDate to);
}
