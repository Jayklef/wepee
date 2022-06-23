package com.example.wepee.service;

import com.example.wepee.entity.Loan;
import com.example.wepee.model.LoanModel;

import java.util.List;

public interface LoanService {

    List<Loan> findAllLoans();

    Loan createNewLoan(LoanModel loanModel);
}
