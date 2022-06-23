package com.example.wepee.model;

import com.example.wepee.entity.Charges;
import com.example.wepee.entity.Loan;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductModel {

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
