package com.example.wepee.model;

import com.example.wepee.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.OneToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChargesModel {

    private String chargeName;
    private String chargeType;
    private Float chargeAmount;

    @OneToOne
    private Product product;
}
