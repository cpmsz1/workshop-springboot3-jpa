package com.educandoweb.course.repositories;

import java.util.List;
import java.util.Optional;

import com.educandoweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	void saveAll(List<Order> asList);

	Optional<Order> findById(Long id);

	List<Order> findAll();

	void save(Order o1);

}
