package com.model;

import com.util.ContactType;

public class ContactsDTO {

	private int id;
	private ContactType type;
	private String value;
	//public Person person;
	
	public ContactsDTO() {}
	
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

	//public Person getPerson() {
//	//	return this.person;
//	//}
//
	//public void setPerson(Person personParam) {
	//	this.person = personParam;
	//}

	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (!this.getClass().equals(obj.getClass())) return false;
		
		ContactsDTO obj2 = (ContactsDTO)obj;
		
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