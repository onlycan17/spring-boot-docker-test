package com.in28minutes.springboot.myfirstwebapp.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.in28minutes.springboot.myfirstwebapp.TodoService.TodoService;

@Controller
public class TodoController {
    @Autowired
    private TodoService todoService;

    @RequestMapping("list-todos")
    public String requestMethodName(ModelMap model) {
        model.put("list", todoService.findByUsername(""));
        return "listTodos";
    }

}
