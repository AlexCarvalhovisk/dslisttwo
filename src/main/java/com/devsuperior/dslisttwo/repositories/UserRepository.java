package com.devsuperior.dslisttwo.repositories;

import com.devsuperior.dslisttwo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
