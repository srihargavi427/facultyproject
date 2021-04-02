package com.org.dpm.controller;

import com.org.dpm.model.JuniorFaculty;
import com.org.dpm.model.SeniorAndJunior;
import com.org.dpm.model.SeniorFaculty;
import com.org.dpm.repository.JuniorAndSeniorRepo;
import com.org.dpm.repository.JuniorRepo;
import com.org.dpm.repository.SeniorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculty1")

public class SeniorAndJuniorContro {
    @Autowired
    SeniorRepo seniorRepo;
    @Autowired
    JuniorRepo juniorRepo;
    @Autowired
    JuniorAndSeniorRepo juniorAndSeniorRepo;

    @PostMapping("/seniorcreate")
    public void createSeniorFaculty(@RequestBody SeniorFaculty seniorFaculty) {
        seniorRepo.save(seniorFaculty);
    }

    @PostMapping("/juniorcreate")
    public void createJuniorFaculty(@RequestBody JuniorFaculty juniorFaculty) {
        juniorRepo.save(juniorFaculty);
    }

    @PostMapping("/Expcreate")
    public void createSeniorAndJunior(@RequestBody SeniorAndJunior seniorAndJunior) {
        juniorAndSeniorRepo.save(seniorAndJunior);
    }


    @GetMapping("/retrivejunior")
    public List<JuniorFaculty> getalljunior() {
        List<JuniorFaculty> all = juniorRepo.findAll();
        return all;
    }

    @GetMapping("/retrivesenior")
    public List<SeniorFaculty> getallsenior() {
        List<SeniorFaculty> all = seniorRepo.findAll();
        return all;
    }

    @GetMapping("retrive")
    public void createSeniorAndJunior() {
        List<SeniorFaculty> seniorFacultyList = seniorRepo.findAll();
        List<JuniorFaculty> juniorFacultyList = juniorRepo.findAll();
        for (int i = 0; i < seniorFacultyList.size(); i++) {
            for (int j = 0; j < juniorFacultyList.size(); j++) {
                SeniorFaculty seniorFaculty = seniorFacultyList.get(i);
                JuniorFaculty juniorFaculty = juniorFacultyList.get(j);
                if (seniorFaculty.getId() == juniorFaculty.getId()) {
                    SeniorAndJunior seniorAndJunior = new SeniorAndJunior();
                    seniorAndJunior.setId(seniorFaculty.getId());
                    seniorAndJunior.setId((juniorFaculty.getId()));
                    seniorAndJunior.setSeniorFacultyDpt(seniorFaculty.getSeniorFacultyDpt());
                    seniorAndJunior.setSeniorFacultyiClg(seniorFaculty.getSeniorFacultyiClg());
                    seniorAndJunior.setSeniorFacultySalary(seniorFaculty.getSeniorFacultySalary());
                }
            }
        }
    }
}