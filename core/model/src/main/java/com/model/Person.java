package com.model;

import java.util.*;
import javax.persistence.*;

import com.util.*;

@Entity
@Table(name = "tblPerson")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Embedded
	private PersonName name;

	@Temporal(TemporalType.DATE)
	@Column(name = "birthday")
	private Date birthday;

	@Column(name = "GWA")
	private float GWA;

	@Temporal(TemporalType.DATE)
	@Column (name = "dateHired")
	private Date dateHired;

	@Column(name = "currentlyEmployed")
	private boolean currentlyEmployed;

	@Column(name = "gender")
	@Enumerated(EnumType.STRING)
	private PersonGender gender;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "addressId")
	//@OnDelete(action = OnDeleteAction.CASCADE)
	private PersonAddress address;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval=true)
	@JoinColumn(name = "personId")
	//@OnDelete(action = OnDeleteAction.CASCADE)
	private Set<Contacts> contacts;

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "tblPerson_Role", joinColumns = @JoinColumn(name = "personId"), inverseJoinColumns = @JoinColumn(name = "roleId", updatable = false))
	private Set<Roles> roles;

	public Person() {}

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

	public Set<Contacts> getContacts() {
		return this.contacts;
	}
	
	public void setContacts(Set<Contacts> contactsParam) {
		this.contacts = contactsParam;
	}

	public Set<Roles> getRoles() {
		return this.roles;
	}
	
	public void setRoles(Set<Roles> rolesParam) {
		this.roles = rolesParam;
	}

}