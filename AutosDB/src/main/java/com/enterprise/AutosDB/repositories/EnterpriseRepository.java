package com.enterprise.AutosDB.repositories;

import com.enterprise.AutosDB.entities.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnterpriseRepository  extends JpaRepository<Enterprise, Long> {
}
