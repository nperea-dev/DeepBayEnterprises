package com.enterprise.AutosDB.repositories;

import com.enterprise.AutosDB.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository  extends JpaRepository<Transaction, Long> {
}
