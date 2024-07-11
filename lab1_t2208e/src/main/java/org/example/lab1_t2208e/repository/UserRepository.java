package org.example.lab1_t2208e.repository;

import org.example.lab1_t2208e.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
