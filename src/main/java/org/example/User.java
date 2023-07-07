package org.example;

public class User {
    private String name;
    private String gender;
    private int age;

    public User(String name_user,String gender_user ,int age_user){
        this.name = name_user;
        this.gender = gender_user;
        this.age = age_user;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User" + name  +
                " gender= " + gender +
                " age=" + age;
    }
}
