package com.example.Davis.college.controller;
import com.example.Davis.college.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseController {
    @Autowired
    private CourseRepository repository;

    public CourseController() {
    }

    @GetMapping("/courseList")

    public String viewCourses(Model model) {
        model.addAttribute("CourseList1", repository.findAll());
        return "courselist";
    }
}