package com.example.tests;

public class Contact {

	public String firstname;
	public String lastname;
	public String email;
	public String street;
	public String city;
	public String code;
	public String country;
	public String phone;
	public String fax;
	public String mobile;
	public String page;
	public String notes;
	public String icont;

	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((fax == null) ? 0 : fax.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((icont == null) ? 0 : icont.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
		result = prime * result + ((page == null) ? 0 : page.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (fax == null) {
			if (other.fax != null)
				return false;
		} else if (!fax.equals(other.fax))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (icont == null) {
			if (other.icont != null)
				return false;
		} else if (!icont.equals(other.icont))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		if (notes == null) {
			if (other.notes != null)
				return false;
		} else if (!notes.equals(other.notes))
			return false;
		if (page == null) {
			if (other.page != null)
				return false;
		} else if (!page.equals(other.page))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Contact [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", street=" + street
				+ ", city=" + city + ", code=" + code + ", country=" + country + ", phone=" + phone + ", fax=" + fax
				+ ", mobile=" + mobile + ", page=" + page + ", notes=" + notes + ", icont=" + icont + "]";
	}

	public Contact setFirstName(String firstname) {
		this.firstname = firstname;
		return this;
	}

	public Contact setLastName(String lastname) {
		this.lastname = lastname;
		return this;
	}
	public Contact setEmailAddress(String email) {
		this.email=email;
		return this;
	}
	
	public Contact setStreetAddress(String street) {
		this.street = street;
		return this;
	}
	public Contact setCity(String city) {
		this.city = city;
	return this;
	}
	public Contact setPostalCode(String code) {
	this.code = code;
	return this;
	}
	public Contact setCountry(String country) {
		this.country = country;
		return this;
		}
	public Contact setPhone(String phone) {
		this.phone = phone;
		return this;
		}
	public Contact setFax(String fax) {
		this.fax = fax;
		return this;
		}
	public Contact setMobile(String mobile) {
		this.mobile = mobile;
		return this;
		}
	public Contact setWebPage(String page) {
		this.page = page;
		return this;
	}
	
	public Contact setInternetcont(String icont) {
		this.icont = icont;
		return this;
	}
	public Contact setNotes(String notes) {
		this.notes = notes;
		return this;
	}
	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}
	public String getEmailAddress() {
		return email;
	}



	
}
