package com.mygroup.myfinalproject.service;

import com.mygroup.myfinalproject.entity.Operations;
import com.mygroup.myfinalproject.repository.OperationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OperationService {
    private final OperationRepository operationRepository;

    @Transactional
    public List<Operations> getOperationsBetweenDates(LocalDate from, LocalDate to) {
        return operationRepository.findOperationsBetweenDates(from, to);

    }
}
