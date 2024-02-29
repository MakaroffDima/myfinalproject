package com.mygroup.myfinalproject.repository;

import com.mygroup.myfinalproject.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface FinanceRepository extends JpaRepository<Accounts, Long> {
    @Modifying
    @Query("UPDATE Accounts a SET a.spendings =:amount WHERE a.id =:id")
    void updateSpendings(Long id, BigDecimal amount);
    @Query("UPDATE Accounts a SET a.incomes =:amount WHERE a.id =:id")
    void updateIncomes(Long id, BigDecimal amount);

}