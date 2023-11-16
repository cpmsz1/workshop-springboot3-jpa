package com.educandoweb.course.repositories;

import java.util.List;
import java.util.Optional;


import com.educandoweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	void saveAll(List<Product> asList);

	Optional<Product> findById(Long id);

	List<Product> findAll();

}

