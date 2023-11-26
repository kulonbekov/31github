package com.kulonbekov.springrestapi.service;

import com.kulonbekov.springrestapi.entity.TodoEntity;
import com.kulonbekov.springrestapi.model.Todo;

public interface TodoService {

    public Todo createTodo(TodoEntity todo, Long userId);
    public Todo completeTodo(Long id);
}
