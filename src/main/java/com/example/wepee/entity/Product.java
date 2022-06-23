package com.example.wepee.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String minimumDuration;
    private String maximumDuration;
    private BigDecimal minimumAmount;
    private BigDecimal maximumAmount;

    @ManyToOne
    private Loan loan;

    @OneToOne
    private Charges charges;

}
