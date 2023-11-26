package com.kulonbekov.springrestapi.service;

import com.kulonbekov.springrestapi.entity.TodoEntity;

public interface TodoService {

    public TodoEntity createTodo(TodoEntity todo, Long userId);
    public TodoEntity completeTodo(Long id);
}
