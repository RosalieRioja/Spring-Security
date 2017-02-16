package com.model;

import java.util.*;

import com.util.*;

public class PersonDTO {

	private int id;
	private PersonName name;
	private Date birthday;
	private float GWA;
	private Date dateHired;
	private boolean currentlyEmployed;
	private PersonGender gender;
	private PersonAddress address;
	private Set<ContactsDTO> contacts;
	private Set<Roles> roles;

	public PersonDTO() {}

	public void setId(int idParam) {
		this.id = idParam;
	}

	public void setName(PersonName nameParam) {
		this.name = nameParam;
	}

	public void setBirthday(Date bdayParam) {
		this.birthday = bdayParam;
	}

	public void setGWA(float gwaParam) {
		this.GWA = gwaParam;
	}

	public void setDateHired(Date datehiredParam) {
		this.dateHired = datehiredParam;
	}

	public void setCurrentlyEmployed(boolean currEmployedParam) {
		this.currentlyEmployed = currEmployedParam;
	}

	public void setGender(PersonGender genderParam) {
		this.gender = genderParam;
	}

	public void setAddress(PersonAddress addressParam) {
		this.address = addressParam;
	}

	public int getId() {
		return this.id;
	}

	public PersonName getName() {
		return this.name;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public float getGWA() {
		return this.GWA;
	}

	public Date getDateHired() {
		return this.dateHired;
	}

	public boolean getCurrentlyEmployed() {
		return this.currentlyEmployed;
	}

	public PersonGender getGender() {
		return this.gender;
	}

	public PersonAddress getAddress() {
		return this.address;
	}

	public Set<ContactsDTO> getContacts() {
		return this.contacts;
	}
	
	public void setContacts(Set<ContactsDTO> contactsParam) {
		this.contacts = contactsParam;
	}

	public Set<Roles> getRoles() {
		return this.roles;
	}
	
	public void setRoles(Set<Roles> rolesParam) {
		this.roles = rolesParam;
	}

}