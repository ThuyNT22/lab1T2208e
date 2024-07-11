package org.example.lab1_t2208e.repository;

import org.example.lab1_t2208e.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
