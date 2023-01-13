package com.midhin.studentsreportingsysytem.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {

    @JsonProperty(" id ")
    private int studentId;
    @JsonProperty("Name")
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
    @JsonProperty("Sem")
    public int getSemester() {
        return Semester;
    }

    public void setSemester(int semester) {
        Semester = semester;
    }
    @JsonProperty("Maths")
    public int getSubjectMaths() {
        return SubjectMaths;
    }

    public void setSubjectMaths(int subjectMaths) {
        SubjectMaths = subjectMaths;
    }
    @JsonProperty("English")
    public int getSubjectEnglish() {
        return SubjectEnglish;
    }

    public void setSubjectEnglish(int subjectEnglish) {
        SubjectEnglish = subjectEnglish;
    }
    @JsonProperty("Science")
    public int getSubjectScience() {
        return SubjectScience;
    }

    public void setSubjectScience(int subjectScience) {
        SubjectScience = subjectScience;
    }
}