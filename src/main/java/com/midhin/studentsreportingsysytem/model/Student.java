package com.midhin.studentsreportingsysytem.model;

public class Student {


    private int studentId;
    private String studentFirstName;
    private int Semester;
    private int SubjectMaths;
    private int SubjectEnglish;
    private int SubjectScience;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public int getSemester() {
        return Semester;
    }

    public void setSemester(int semester) {
        Semester = semester;
    }

    public int getSubjectMaths() {
        return SubjectMaths;
    }

    public void setSubjectMaths(int subjectMaths) {
        SubjectMaths = subjectMaths;
    }

    public int getSubjectEnglish() {
        return SubjectEnglish;
    }

    public void setSubjectEnglish(int subjectEnglish) {
        SubjectEnglish = subjectEnglish;
    }

    public int getSubjectScience() {
        return SubjectScience;
    }

    public void setSubjectScience(int subjectScience) {
        SubjectScience = subjectScience;
    }
}