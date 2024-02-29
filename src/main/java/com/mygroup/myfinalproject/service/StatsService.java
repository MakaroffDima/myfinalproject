package com.mygroup.myfinalproject.service;

import com.mygroup.myfinalproject.entity.Accounts;
import com.mygroup.myfinalproject.exception.NotFoundException;
import com.mygroup.myfinalproject.repository.StatsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class StatsService {

    private final StatsRepository statsRepository;

    public String getBalance(Long id) {
        BigDecimal balance = statsRepository.findById(id)
                .map(Accounts::getBalance)
                .orElseThrow(() -> new NotFoundException(-1, "Ошибка при выполнении операции-неверный id"));
        return "Текущий баланс пользователя: " + balance.toString();
    }

}