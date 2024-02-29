package com.mygroup.myfinalproject.repository;

import com.mygroup.myfinalproject.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatsRepository extends JpaRepository<Accounts,Long> {

}