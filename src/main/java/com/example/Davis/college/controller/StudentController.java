package com.example.Davis.college.controller;
import com.example.Davis.college.entity.Student;
import com.example.Davis.college.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    @Autowired

    private StudentRepository repository;

    @GetMapping("/StudentList")

    public String viewStudent(Model model, Student student) {
        model.addAttribute("StudentList1", repository.findAll());
        return "StudentList";
    }
}