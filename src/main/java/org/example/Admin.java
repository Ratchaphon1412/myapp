package org.example;

import java.util.ArrayList;

public class Admin {
    private String name;
    private String password;
    private String role;
    private ArrayList<String> listUser;



    public Admin(String name_admin , String password_admin,String role){
        this.name = name_admin;
        this.password = password_admin;
        this.role = role;
        this.listUser = new ArrayList<String>();
    }

    public Admin(String name_admin,String password_admin,String role,ArrayList<String>list_user){
        this.name = name_admin;
        this.password = password_admin;
        this.role = role;
        this.listUser = list_user;

    }






    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }
}
