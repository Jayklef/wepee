package com.example.wepee.controller;

import com.example.wepee.entity.Loan;
import com.example.wepee.model.LoanModel;
import com.example.wepee.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/loans")
public class LoanController {

    private LoanService loanService;

    @Autowired
    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Loan>> getAllLoans(){
        List<Loan> loans = loanService.findAllLoans();
        return new ResponseEntity<>(loans, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Loan> createLoan(@RequestBody LoanModel loanModel){
        Loan newLoan = loanService.createNewLoan(loanModel);
        return new ResponseEntity<>(newLoan, HttpStatus.CREATED);
    }

}
