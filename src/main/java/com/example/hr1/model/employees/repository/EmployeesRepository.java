package com.example.hr1.model.employees.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hr1.model.employees.entity.EmployeesEntity;
import java.util.Optional;


public interface EmployeesRepository extends JpaRepository<EmployeesEntity, Integer> {
    Optional<EmployeesEntity> findByEmployeeId(Integer employeeId);
    
}
