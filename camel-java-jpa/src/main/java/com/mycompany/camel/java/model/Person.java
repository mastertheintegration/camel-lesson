package com.mycompany.camel.java.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement
@XmlType
@Entity(name="Person")
public class Person {
	private Long id;
private String name;
private String surname;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}


}
