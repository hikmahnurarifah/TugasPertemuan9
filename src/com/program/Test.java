/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.program;

/**
 *
 * @author Hikmah
 */
public class Test {
    public static void main(String[] args) {
        // Membuat objek Person
        Person person = new Person("Park Jeongwoo", "123 Bandung", "555-1234", "pjeongwoo@gmail.com");
        
        // Membuat objek Student
        Student student = new Student("Enami Asa", "456 Karawang", "555-5678", "enamiasa@gmail.com", Student.SENIOR);
        
        // Membuat objek Employee
        MyDate hireDate = new MyDate(2020, 1, 15);
        Employee employee = new Employee("Byeon Wooseok", "789 Jogja", "555-8765", "byeonws@gmail.com", "Kantor Pusat", 50000, hireDate);
        
        // Membuat objek Faculty
        Faculty faculty = new Faculty("Hanni Pham", "321 Jakarta", "555-2345", "hannibunny@gmail.com", "Gedung Sains", 70000, new MyDate(2018, 9, 1), "9 AM - 5 PM", "Professor");
        
        // Membuat objek Staff
        Staff staff = new Staff("Go Younjung", "654 Surabaya", "555-3456", "goyounjung@gmail.com", "Gedung Administrasi", 40000, new MyDate(2019, 6, 25), "Manager");

        // Memanggil metode toString() mereka
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}

