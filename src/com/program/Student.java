/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.program;

/**
 *
 * @author Hikmah
 */
public class Student extends Person {
    public static final String FRESHMAN = "Mahasiswa Baru";
    public static final String SOPHOMORE = "Mahasiswa Tahun Kedua";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String statusKelas;

    public Student() {
    }

    public Student(String nama, String alamat, String nomorTelepon, String email, String statusKelas) {
        super(nama, alamat, nomorTelepon, email);
        this.statusKelas = statusKelas;
    }

    public String getStatusKelas() {
        return statusKelas;
    }

    public void setStatusKelas(String statusKelas) {
        this.statusKelas = statusKelas;
    }

    @Override
    public String toString() {
        return "Student: " + getNama();
    }
}

