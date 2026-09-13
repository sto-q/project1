package com.lq.pojo;

public class student {
    int id;
    int student_no;
    String name;
    String gender;
    int age;
    String class_name;
    String major;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudent_no() {
        return student_no;
    }

    public void setStudent_no(int student_no) {
        this.student_no = student_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", student_no=" + student_no +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", class_name='" + class_name + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
