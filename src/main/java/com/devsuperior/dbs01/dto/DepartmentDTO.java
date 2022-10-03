package com.devsuperior.dbs01.dto;

import com.devsuperior.dbs01.entities.Department;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class DepartmentDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    public Long id;
    public String name;


    public DepartmentDTO() {
    }

    public DepartmentDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public DepartmentDTO(Department department) {
        this.id = department.id;
        this.name = department.name;
    }
}
