package com.example.employees.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

  @Id
  private Integer id;

  @Column(name="first_name")
  private String firstName;

  @Column(name="last_name")
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
