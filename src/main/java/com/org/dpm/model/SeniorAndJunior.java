package com.org.dpm.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SeniorAndJunior {
    @Id
    private int Id;
    private String SeniorFacultyDpt;
    private String SeniorFacultyiClg;
    private Double SeniorFacultySalary;

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

    public String getJuniorFacultyDpt() {
        return JuniorFacultyDpt;
    }

    public void setJuniorFacultyDpt(String juniorFacultyDpt) {
        JuniorFacultyDpt = juniorFacultyDpt;
    }

    public String getJuniorFacultyClg() {
        return JuniorFacultyClg;
    }

    public void setJuniorFacultyClg(String juniorFacultyClg) {
        JuniorFacultyClg = juniorFacultyClg;
    }

    public Double getJuniorFacultySalary() {
        return JuniorFacultySalary;
    }

    public void setJuniorFacultySalary(Double juniorFacultySalary) {
        JuniorFacultySalary = juniorFacultySalary;
    }

    private String JuniorFacultyDpt;
    private String JuniorFacultyClg;
    private Double JuniorFacultySalary;
}
