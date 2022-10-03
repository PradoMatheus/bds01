package com.devsuperior.dbs01.services;

import com.devsuperior.dbs01.dto.EmployeeDTO;
import com.devsuperior.dbs01.entities.Department;
import com.devsuperior.dbs01.entities.Employee;
import com.devsuperior.dbs01.repositories.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Transactional(readOnly = true)
    public Page<EmployeeDTO> findAll(Pageable pageable) {
        var page = repository.findAll(pageable);
        return page.map(x -> new EmployeeDTO(x));
    }

    @Transactional
    public EmployeeDTO insert(EmployeeDTO employeeDTO) {
        var employee = new Employee();
        BeanUtils.copyProperties(employeeDTO, employee);
        employee.setDepartment(new Department(employeeDTO.getDepartmentId(), null));
        employee = repository.save(employee);
        return new EmployeeDTO(employee);
    }
}
