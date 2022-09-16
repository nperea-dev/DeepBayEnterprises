package com.enterprise.DeepBayAutos.repositories;

import com.enterprise.DeepBayAutos.entities.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnterpriseRepository  extends JpaRepository<Enterprise, Long> {
}
