package com.enterprise.DeepBayAutos.repositories;

import com.enterprise.DeepBayAutos.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository  extends JpaRepository<Transaction, Long> {
}
