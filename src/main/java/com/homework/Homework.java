package com.homework;

import java.util.ArrayList;

public class Homework {
    private ArrayList<String> listHomework;


    public Homework(){
        this.listHomework = new ArrayList<String>();
    }

    public ArrayList<String> getListHomework() {
        System.out.println("Hello");
        return listHomework;
    }
}
