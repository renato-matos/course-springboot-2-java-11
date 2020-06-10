package com.galtconsulting.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.galtconsulting.course.entities.OrderItem;

// Não precisa do @Repository porque a interface já extende JpaRepository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
