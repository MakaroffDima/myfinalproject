package com.mygroup.myfinalproject.service;

import com.mygroup.myfinalproject.entity.Accounts;
import com.mygroup.myfinalproject.entity.Operations;
import com.mygroup.myfinalproject.exception.NotEnoughMoneyException;
import com.mygroup.myfinalproject.exception.NotFoundException;
import com.mygroup.myfinalproject.repository.FinanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class FinanceService {

    private final FinanceRepository financeRepository;

    @Transactional
    public String takeMoney(Long id, BigDecimal amount) {
        Accounts account = financeRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(-1, "Ошибка при выполнении операции-неправильный id"));
        if (account.getBalance().compareTo(amount) < 0) {
            throw new NotEnoughMoneyException(0, "Недостаточно денег на балансе");
        }
        account.setBalance(account.getBalance().subtract(amount));
        account.setSpendings(account.getSpendings().add(amount));
        account.getOperations().add(Operations.builder()
                .userid(account.getId())
                .operationType("spending")
                .amount(amount)
                .date(LocalDate.now())
                .build());
        return "Снятие суммы прошло успешно: " + amount;
    }

    @Transactional
    public String putMoney(Long id, BigDecimal amount) {
        Accounts account = financeRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(-1, "Ошибка при выполнении операции-неправильный id"));
        account.setBalance(account.getBalance().add(amount));
        account.setIncomes(account.getIncomes().add(amount));
        account.getOperations().add(Operations.builder()
                .userid(account.getId())
                .operationType("income")
                .amount(amount)
                .date(LocalDate.now())
                .build());
        return "Пополнение на сумму прошло успешно: " + amount;
    }

    @Transactional
    public String transferMoney(Long id1, Long id2, BigDecimal amount) {
        Accounts account = financeRepository.findById(id1)
                .orElseThrow(() -> new NotFoundException(-1, "Неправильный id"));
        Accounts account2 = financeRepository.findById(id2)
                .orElseThrow(() -> new NotFoundException(-1, "Неправильный id №2"));
        if (account.getBalance().compareTo(amount) < 0) {
            throw new NotEnoughMoneyException(-2, "Недостаточно денег для перевода");
        }
        account.setBalance(account.getBalance().subtract(amount));
        account.setSpendings(account.getSpendings().add(amount));
        account2.setBalance(account2.getBalance().add(amount));
        account2.setIncomes(account2.getIncomes().add(amount));
        account.getOperations().add(Operations.builder()
                .userid(account.getId())
                .operationType("transfer")
                .amount(amount)
                .date(LocalDate.now())
                .build());
        return "Перевод суммы абоненту № " + id2 + amount + " выполнен успешно ";
    }
}
