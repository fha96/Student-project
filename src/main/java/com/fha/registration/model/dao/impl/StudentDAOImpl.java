package com.fha.registration.model.dao.impl;

import com.fha.registration.model.dao.StudentDAO;
import com.fha.registration.model.entity.Student;
import database.MyDB;

import java.sql.SQLException;

public class StudentDAOImpl implements StudentDAO {
    MyDB db=new MyDB();
    Student student= new Student();


    public StudentDAOImpl() throws SQLException {
    }

    public void delete(Student student) {

    }

    public Student findById() throws SQLException {
        String findId="SELECT * FROM studentdb.student \n" +
                "where id=?;";
        db.executeQuery(findId);
        return student;
    }

    public Student findByEmail() {
        String findEmail="Select *from studentdb.student \n"+
                "where email=?";
        try {
            db.executeQuery(findEmail);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void save(Student student) {
        String save="insert into studentdb.student(id,firstName,lastName,email,password,joinYear) \n"+
                "values(?,?,?,?,?,?)";
        try {
            db.executeUpdate(save);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Student student) {

    }
}
