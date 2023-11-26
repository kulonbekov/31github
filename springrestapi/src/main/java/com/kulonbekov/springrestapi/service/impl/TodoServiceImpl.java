package com.kulonbekov.springrestapi.service.impl;

import com.kulonbekov.springrestapi.entity.TodoEntity;
import com.kulonbekov.springrestapi.entity.UserEntity;
import com.kulonbekov.springrestapi.model.Todo;
import com.kulonbekov.springrestapi.repository.TodoRepo;
import com.kulonbekov.springrestapi.repository.UserRepo;
import com.kulonbekov.springrestapi.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepo todoRepo;
    @Autowired
    private UserRepo userRepo;

    public Todo createTodo(TodoEntity todo, Long userId){
        UserEntity user = userRepo.findById(userId).get();
        todo.setUser(user);
        return Todo.toModel(todoRepo.save(todo));
    }

    public Todo completeTodo(Long id){
        TodoEntity todo = todoRepo.findById(id).get();
        todo.setCompleted(!todo.getCompleted());
        return Todo.toModel(todoRepo.save(todo));
    }
}
