package com.fha.registration.model.entity;

public class Student {
 String id;
 String firstName;
 String lastName;
 String email;
 String password;
 String joinYear;

 public Student() {
 }

 public Student(String firstName, String lastName, String email, String password, String joinYear) {
  this.id= String.valueOf(idCounter());
  this.firstName = firstName;
  this.lastName = lastName;
  this.email = email;
  this.password = password;
  this.joinYear = joinYear;
 }

 private static int idCounter(){
  int idc=1;
  return idc++;
 }
}
