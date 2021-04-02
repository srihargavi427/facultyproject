package com.org.dpm.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SeniorFaculty {
    @Id
    private int Id;
    private String SeniorFacultyDpt;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getSeniorFacultyDpt() {
        return SeniorFacultyDpt;
    }

    public void setSeniorFacultyDpt(String seniorFacultyDpt) {
        SeniorFacultyDpt = seniorFacultyDpt;
    }

    public String getSeniorFacultyiClg() {
        return SeniorFacultyiClg;
    }

    public void setSeniorFacultyiClg(String seniorFacultyiClg) {
        SeniorFacultyiClg = seniorFacultyiClg;
    }

    public Double getSeniorFacultySalary() {
        return SeniorFacultySalary;
    }

    public void setSeniorFacultySalary(Double seniorFacultySalary) {
        SeniorFacultySalary = seniorFacultySalary;
    }

    private String SeniorFacultyiClg;
    private Double SeniorFacultySalary;



}
