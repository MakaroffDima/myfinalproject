package com.mygroup.myfinalproject.controllers;

import com.mygroup.myfinalproject.entity.Operations;
import com.mygroup.myfinalproject.service.OperationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class OperationController {
    private final OperationService operationService;

    @GetMapping("/getOperationsBetweenDates")
    public List<Operations> getOperationsBetweenDates(@RequestParam(value = "from") String from,
                                                      @RequestParam(value = "to") String to) {
        return operationService.getOperationsBetweenDates(LocalDate.parse(from), LocalDate.parse(to));
    }
}
