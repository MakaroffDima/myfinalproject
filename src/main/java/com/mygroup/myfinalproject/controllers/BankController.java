package com.mygroup.myfinalproject.controllers;


import com.mygroup.myfinalproject.dto.PutMoneyRequest;
import com.mygroup.myfinalproject.dto.TakeMoneyRequest;
import com.mygroup.myfinalproject.dto.TransferMoneyRequest;
import com.mygroup.myfinalproject.service.FinanceService;
import com.mygroup.myfinalproject.service.StatsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
public class BankController {

    private final StatsService statsService;
    private final FinanceService financeService;

    @GetMapping("/getBalance")
    public String getBalance(@RequestParam(value = "id") Long id) {
        return statsService.getBalance(id);
    }

    @PutMapping("/takeMoney")
    public String takeMoney(@RequestBody TakeMoneyRequest request) {
        return financeService.takeMoney(request.getId(), request.getAmount());
    }

    @PutMapping("/putMoney")
    public String putMoney(@RequestBody PutMoneyRequest request) {
        return financeService.putMoney(request.getId(), request.getAmount());
    }

    @PutMapping("/transferMoney")
    public String transferMoney(@RequestBody TransferMoneyRequest request) {
        return financeService.transferMoney(request.getId(), request.getId2(), request.getAmount());
    }
}


