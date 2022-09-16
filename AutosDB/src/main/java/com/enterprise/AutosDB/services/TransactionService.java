package com.enterprise.AutosDB.services;

import com.enterprise.AutosDB.repositories.TransactionRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    private TransactionRepository repository;

    public TransactionService(TransactionRepository repository){
        this.repository = repository;
    }


}
