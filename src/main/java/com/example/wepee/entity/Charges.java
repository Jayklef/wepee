package com.example.wepee.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Charges {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String chargeName;
    private String chargeType;
    private Float chargeAmount;

    @OneToOne
    private Product product;
}
