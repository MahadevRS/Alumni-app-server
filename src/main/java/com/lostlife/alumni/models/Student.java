package com.lostlife.alumni.models;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String branch;

    private int graduationyear;

    private String mobNo;

    @Column(unique = true)
    private String email;

    public Student() {
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getGraduationyear() {
        return graduationyear;
    }

    public void setGraduationyear(int graduationyear) {
        this.graduationyear = graduationyear;
    }
}
