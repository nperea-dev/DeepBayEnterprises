package com.enterprise.AutosDB.repositories;

import com.enterprise.AutosDB.entities.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EmpleadoRepository  extends JpaRepository<Empleado, Long> {
}
