package com.devsuperior.dbs01.repositories;

import com.devsuperior.dbs01.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
