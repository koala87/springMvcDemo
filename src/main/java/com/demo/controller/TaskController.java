package com.demo.controller;

import com.demo.service.TaskManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * Created by harryjin on 18/5/6.
 */

@Controller
@RequestMapping("/tasks")

public class TaskController {
    @Autowired
    TaskManager manager;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getTasks(Model model) {
        model.addAttribute("tasks", manager.getTasks());
        return "getTasks";
    }

}