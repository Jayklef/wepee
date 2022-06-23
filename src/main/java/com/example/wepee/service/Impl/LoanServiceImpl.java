package com.example.wepee.service.Impl;

import com.example.wepee.entity.Loan;
import com.example.wepee.model.LoanModel;
import com.example.wepee.repository.LoanRepository;
import com.example.wepee.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanServiceImpl implements LoanService {

    private LoanRepository loanRepository;

    @Autowired
    public LoanServiceImpl(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    @Override
    public List<Loan> findAllLoans(){
        return loanRepository.findAll();
    }

    @Override
    public Loan createNewLoan(LoanModel loanModel){

        Loan newLoan = Loan.builder()
                .amount(loanModel.getAmount())
                .duration(loanModel.getDuration())
                .products(loanModel.getProducts())
                .build();
        return loanRepository.save(newLoan);
    }
}
