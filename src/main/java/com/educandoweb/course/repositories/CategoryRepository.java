package com.educandoweb.course.repositories;

import java.util.List;
import java.util.Optional;

import com.educandoweb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	void saveAll(List<Category> asList);

	Optional<Category> findById(Long id);

	List<Category> findAll();

}

