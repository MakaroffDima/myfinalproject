package com.mygroup.myfinalproject.dto;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TransferMoneyRequest {
    private Long id;
    private Long id2;
    private BigDecimal amount;
}
