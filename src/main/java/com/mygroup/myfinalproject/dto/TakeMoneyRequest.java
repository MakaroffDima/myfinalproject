package com.mygroup.myfinalproject.dto;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TakeMoneyRequest {
    private Long id;
    private BigDecimal amount;
}
