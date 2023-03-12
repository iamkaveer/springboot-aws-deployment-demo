package com.aws.deployment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aws.deployment.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

}
