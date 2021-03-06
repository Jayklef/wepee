package com.example.wepee.model;

import com.example.wepee.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientModel {

    private String fullname;
    private String age;
    private String phonenumber;
    private String bankName;
    private String accountNumber;
    private String bvn;
    private String nin;
    private Product product;
}
