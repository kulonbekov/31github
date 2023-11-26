package com.kulonbekov.springrestapi.controller;

import com.kulonbekov.springrestapi.entity.TodoEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @PostMapping
    public ResponseEntity createTodo(@RequestBody TodoEntity todo,
                                     @RequestParam Long userId) {
        try{

        }catch (Exception e){

        }
    }

    @PutMapping
    public ResponseEntity completeTodo(@RequestParam Long userId) {
        try{

        }catch (Exception e){

        }
    }
}
