package org.example.lab1_t2208e.repository;

import org.example.lab1_t2208e.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
