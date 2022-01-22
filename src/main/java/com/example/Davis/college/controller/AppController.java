package com.example.Davis.college.controller;

import com.example.Davis.college.entity.Course;
import com.example.Davis.college.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    @Autowired
    CourseRepository CourseRepository;

    @GetMapping("/")
    public String showHome(Model model) {
        model.addAttribute("courses", new Course());
        model.addAttribute("CoursesList", CourseRepository.findAll());
        return "index";
    }
}