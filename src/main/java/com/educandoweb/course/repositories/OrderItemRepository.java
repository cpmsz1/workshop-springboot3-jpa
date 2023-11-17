package com.educandoweb.course.repositories;

import java.util.List;
import java.util.Optional;

import com.educandoweb.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	void saveAll(List<OrderItem> asList);

	Optional<OrderItem> findById(Long id);

	List<OrderItem> findAll();

}

