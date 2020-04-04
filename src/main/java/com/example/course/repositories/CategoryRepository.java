package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.course.entities.Category;

@Repository //não precisa colocar a annotation pq tá herdando de uma classe que é registrada no spring
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
