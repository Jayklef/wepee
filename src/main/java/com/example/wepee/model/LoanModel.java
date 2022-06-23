package com.example.wepee.model;

import com.example.wepee.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanModel {

    private BigDecimal amount;
    private String duration;

    @OneToMany
    private Set<Product> products;
}
