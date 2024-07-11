package org.example.lab1_t2208e.repository;

import org.example.lab1_t2208e.entity.Corporation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorporationRepository extends JpaRepository<Corporation, Long> {
}
