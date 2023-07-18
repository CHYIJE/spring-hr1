package com.example.hr1.domain.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hr1.domain.emp.dto.EmpTableDTO;
import com.example.hr1.model.employees.repository.EmployeesRepository;

@Service
public class EmpService {

    @Autowired
    private EmployeesRepository employeesRepository;

    public List<EmpTableDTO> getEmpTableData(){
        return EmpTableDTO.fromEntityList(employeesRepository.findAll());
    }
    
}
