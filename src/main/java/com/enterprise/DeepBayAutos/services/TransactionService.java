package com.enterprise.DeepBayAutos.services;

import com.enterprise.DeepBayAutos.repositories.TransactionRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    private TransactionRepository repository;

    public TransactionService(TransactionRepository repository){
        this.repository = repository;
    }


}
