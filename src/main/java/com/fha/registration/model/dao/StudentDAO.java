package com.fha.registration.model.dao;

import com.fha.registration.model.entity.Student;

import java.sql.SQLException;

public interface StudentDAO {
    Student findById() throws SQLException;
    Student findByEmail();
    void save(Student student);
    void update(Student student);
    void delete(Student student);

}
