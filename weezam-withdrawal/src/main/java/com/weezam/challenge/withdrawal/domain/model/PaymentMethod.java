package com.weezam.challenge.withdrawal.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentMethod {

    private Long id;
    private String name;
    
}