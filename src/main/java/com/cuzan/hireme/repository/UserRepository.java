package com.cuzan.hireme.repository;

import com.cuzan.hireme.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
