package com.example.dicky.ormlitetest.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class TeacherBean implements Serializable{
    @SerializedName("god_age")
    private int age = 28;

    @Override
    public String toString() {
        return "TeacherBean{" +
                "age=" + age +
                '}';
    }
}
