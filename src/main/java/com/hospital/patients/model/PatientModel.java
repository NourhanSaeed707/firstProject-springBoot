package com.hospital.patients.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PatientModel {
    List<String> name = new ArrayList<>();

    PatientModel(){
        name.add("nourhan");
        name.add("reham");
        name.add("omnia");
    }
    public String getPatientFromDatabase(){
        return name.get(0);
    }
}
