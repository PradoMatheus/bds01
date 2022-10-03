package com.devsuperior.dbs01.dto;

import com.devsuperior.dbs01.entities.Employee;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class EmployeeDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String email;
    private Long departmentId;

    public EmployeeDTO() {
    }

    public EmployeeDTO(Long id, String name, String email, Long departmentId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.departmentId = departmentId;
    }

    public EmployeeDTO(Employee entity) {
        id = entity.getId();
        name = entity.getName();
        email = entity.getEmail();
        departmentId = entity.getDepartment().getId();
    }
}
