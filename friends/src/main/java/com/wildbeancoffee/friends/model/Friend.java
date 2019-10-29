package com.wildbeancoffee.friends.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Friend{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String firstName;
  private String lastName;
  int age;
  @JsonIgnore
  boolean married;
  
  public int getAge() {
	return age;
}
 
 @OneToMany(cascade = CascadeType.ALL)  
 List<Address> addresses;

public List<Address> getAddresses() {
	return addresses;
}

public void setAddresses(List<Address> addresses) {
	this.addresses = addresses;
}

public void setAge(int age) {
	this.age = age;
}

public boolean isMarried() {
	return married;
}

public void setMarried(boolean married) {
	this.married = married;
}

public Friend(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public Friend() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
