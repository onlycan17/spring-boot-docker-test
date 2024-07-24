package com.in28minutes.springboot.myfirstwebapp.TodoService;

import org.springframework.stereotype.Service;

import com.in28minutes.springboot.myfirstwebapp.todo.Todo;

import java.util.*;
import java.time.LocalDate;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<Todo>();

    static {
        todos.add(new Todo(1, "in28minutes", "Learn Spring MVC", LocalDate.now(), false));
        todos.add(new Todo(2, "in28minutes", "Learn Struts", LocalDate.now(), false));
        todos.add(new Todo(3, "in28minutes", "Learn Hibernate", LocalDate.now(), false));
    }

    public List<Todo> findByUsername(String username) {
        if (username.length() > 0) {
            todos.removeIf(todo -> !todo.getUser().equals(username));
        }
        return todos;
    }
}
