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
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fullname;
    private String age;
    private String phonenumber;
    private String bankName;
    private String accountNumber;
    private String bvn;
    private String nin;

    @ManyToOne
    private Product product;
}
