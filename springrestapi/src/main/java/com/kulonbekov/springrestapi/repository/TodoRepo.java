package com.kulonbekov.springrestapi.repository;

import com.kulonbekov.springrestapi.entity.TodoEntity;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<TodoEntity, Long> {
}
