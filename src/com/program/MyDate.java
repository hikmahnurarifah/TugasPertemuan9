/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.program;

/**
 *
 * @author Hikmah
 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        this.year = calendar.get(java.util.Calendar.YEAR);
        this.month = calendar.get(java.util.Calendar.MONTH) + 1;
        this.day = calendar.get(java.util.Calendar.DAY_OF_MONTH);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}

