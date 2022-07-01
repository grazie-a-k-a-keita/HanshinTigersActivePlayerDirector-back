package com.consallink.HanshinTigersActivePlayerDirector.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "active_player")
public class ActivePlayer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String backNumber;
	private String birthday;
	private int age;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getBackNumber() {
		return backNumber;
	}

	public String getBirthday() {
		return birthday;
	}

	public int getAge() {
		return age;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBackNumber(String backNumber) {
		this.backNumber = backNumber;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
