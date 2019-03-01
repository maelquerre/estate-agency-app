package io.github.glascode.estateagency;

public class Seller {
    private String id;
    private String surname;
    private String name;
    private String email;
    private String phone;

	public Seller(String id, String surname, String name, String email, String phone) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public String getSurname() {
		return surname;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}
}
