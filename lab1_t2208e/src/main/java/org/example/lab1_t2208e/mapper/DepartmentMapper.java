package org.example.lab1_t2208e.mapper;

import org.example.lab1_t2208e.dto.DepartmentDTO;
import org.example.lab1_t2208e.entity.Company;
import org.example.lab1_t2208e.entity.Department;

public class DepartmentMapper {
    public DepartmentDTO toDTO(Department department) {
        return new DepartmentDTO(department.getId(), department.getName(), department.getCompany().getId());
    }

    public static Department toEntity(DepartmentDTO departmentDTO, Company company) {
        return new Department(departmentDTO.getName(), company);
    }
}
