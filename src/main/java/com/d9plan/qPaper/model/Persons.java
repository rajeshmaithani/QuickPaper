package com.d9plan.qPaper.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dbo_persons", catalog = "kkaur")
public class Persons implements java.io.Serializable {

	private Integer Id;
	private String firstName;
	private String lastName;
	private Integer age;
	
	public Persons() {
	}

	public Persons(Integer Id, String firstName, String lastName, Integer age) {
		this.Id = Id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.Id;
	}

	public void setId(Integer Id) {
		this.Id = Id;
	}

	@Column(name = "FIRSTNAME", unique = true, nullable = false, length = 10)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "LASTNAME", unique = true, nullable = false, length = 20)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "AGE", unique = true, nullable = false)
	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "Persons [firstName=" + firstName + ", Id=" + Id
				+ ", lastName=" + lastName + ", age=" + age + "]";
	}
}