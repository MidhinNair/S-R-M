package com.midhin.studentsreportingsysytem.api;

import com.midhin.studentsreportingsysytem.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.midhin.studentsreportingsysytem.service.StudentsService;

import java.util.List;

@RestController
@RequestMapping(value="/students")
public class StudentResource {
    @Autowired
    private StudentsService studentService;
    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @GetMapping
     public List<Student> getStudents (){
        return studentService.getStudents();
     }
     @GetMapping(value="/{studentId}")
     public Student getStudents (@PathVariable("studentId") int studentId){
        return  studentService.getStudent(studentId);
     }

}
