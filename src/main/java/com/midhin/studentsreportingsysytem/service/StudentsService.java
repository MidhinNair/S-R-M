package com.midhin.studentsreportingsysytem.service;

import com.midhin.studentsreportingsysytem.model.Student;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
@Component
public class StudentsService {
    private int studentIdcount = 1;
    private List<Student> studentList = new CopyOnWriteArrayList<>();
    public Student addStudent(Student student){
        student.setStudentId(studentIdcount);
        studentList.add(student);
        studentList.add(student);
        studentIdcount++;
        return student;
    }
    public List<Student> getStudents(){
        return  studentList;
    }
    public Student getStudent(int studentId){
       return  studentList
                .stream()
                .filter(s->s.getStudentId() == studentId)
                .findFirst()
                .get();
    }
    public Student updateStudent(int studentId,Student student){
          studentList
                .stream()
                .forEach(s-> {
                    if (s.getStudentId() == studentId) {
                        s.setStudentFirstName(student.getStudentFirstName());
                        s.setSemester(student.getSemester());
                        s.setSubjectEnglish(student.getSubjectEnglish());
                        s.setSubjectMaths(student.getSubjectMaths());
                        s.setSubjectScience(student.getSubjectScience());

                    }
                });
                return studentList
                        .stream()
                        .filter(s->s.getStudentId()== studentId)
                        .findFirst()
                        .get();

    }


}
