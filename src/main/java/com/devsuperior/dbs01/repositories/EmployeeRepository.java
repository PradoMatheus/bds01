package com.devsuperior.dbs01.repositories;

import com.devsuperior.dbs01.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
