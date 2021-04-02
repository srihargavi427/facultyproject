package com.org.dpm.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class JuniorFaculty {
    @Id
    private int Id;
    private String JuniorFacultyDpt;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    private String JuniorFacultyClg;
    private Double JuniorFacultySalary;
}
