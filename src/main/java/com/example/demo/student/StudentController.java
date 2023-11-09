package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService  studentService) {

        this.studentService = studentService;
    }

    @RequestMapping(path = "api/v1/student", method = RequestMethod.GET)

    public List<Student> getStudents() {
return studentService.getStudents();

    }

    @PostMapping
    public void registerNewStudent(Student student){
        studentService.addNewStudent(student);

    }

}
