package com.mygroup.myfinalproject.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
public class Accounts {

    @Id
    @Column(name = "userid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "incomes")
    private BigDecimal incomes;

    @Column(name = "userbalance")
    private BigDecimal balance;

    @Column(name = "spendings")
    private BigDecimal spendings;

    @Column(name = "DATE")
    private LocalDate date;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "userid")
    private Set<Operations> operations;

}