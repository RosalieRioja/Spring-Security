package com.model;

import javax.persistence.*;

import com.util.ContactType;

@Entity
@Table(name = "tblContact")
public class Contacts {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "type")
	@Enumerated(EnumType.STRING)
	private ContactType type;

	@Column(name = "value")
	private String value;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "personId", referencedColumnName = "id")
	//@OnDelete(action = OnDeleteAction.CASCADE)
	public Person person;
	
	public Contacts() {}
	
	public int getId() {
		return this.id;
	}
	
	public void setId( int id ) {
		this.id = id;
	}
	
	public ContactType getType() {
		return this.type;
	}
	
	public void setType( ContactType typeParam ) {
		this.type = typeParam;
	}

	public String getValue() {
		return this.value;
	}
	
	public void setValue( String valueParam ) {
		this.value = valueParam;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person personParam) {
		this.person = personParam;
	}

	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (!this.getClass().equals(obj.getClass())) return false;
		
		Contacts obj2 = (Contacts)obj;
		
		if((this.value.equals(obj2.getValue())))
		{
			return true;
		}
		
		return false;
	}
	
	public int hashCode() {
		return this.value.hashCode();
	}
	
}