package com.midhin.studentsreportingsysytem.api;

import com.midhin.studentsreportingsysytem.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.midhin.studentsreportingsysytem.service.StudentsService;
@RestController
@RequestMapping(value="/students")
public class StudentResource {
    @Autowired
    private StudentsService studentService;
    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);


    }
}
