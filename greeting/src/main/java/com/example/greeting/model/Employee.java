package com.example.greeting.model;

public class Employee {

  private Integer id;
  private String firstName;
  private String lastName;

  public Employee() {

  }

  public Integer getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  public void setId(final Integer id) {
    this.id = id;
  }
}

