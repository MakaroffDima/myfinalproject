package com.mygroup.myfinalproject;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ErrorResponse {

    private int code;
    private String description;


}

