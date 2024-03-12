package Jsd_2DB.example.CurdDBConnection.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student_info")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int admno;

    String name;
    String semister;

    int age;

    String address;

    public Student() {
    }

    public Student(int admno, String name, String semister, int age, String address) {
        this.admno = admno;
        this.name = name;
        this.semister = semister;
        this.age = age;
        this.address = address;
    }

    public int getAdmno() {
        return admno;
    }

    public void setAdmno(int admno) {
        this.admno = admno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemister() {
        return semister;
    }

    public void setSemister(String semister) {
        this.semister = semister;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
