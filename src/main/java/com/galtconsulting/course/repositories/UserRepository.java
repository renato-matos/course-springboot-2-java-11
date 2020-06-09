package com.galtconsulting.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.galtconsulting.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
