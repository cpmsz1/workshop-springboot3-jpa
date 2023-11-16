package com.educandoweb.course.repositories;

import java.util.List;
import java.util.Optional;

import com.educandoweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	void saveAll(List<User> asList);

	Optional<User> findById(Long id);

	List<User> findAll();

}

