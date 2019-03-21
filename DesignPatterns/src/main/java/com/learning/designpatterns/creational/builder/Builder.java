package com.learning.designpatterns.creational.builder;

class User {
	private final String firstName;
	private final String lastName;
	private final Integer age;
	private final String address;
	private final String phone;

	public User(UserBuilder userBuilder) {
		firstName = userBuilder.firstName;
		lastName = userBuilder.lastName;
		age = userBuilder.age;
		address = userBuilder.address;
		phone = userBuilder.phone;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Integer getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=" + address
				+ ", phone=" + phone + "]";
	}

	public static class UserBuilder {
		private final String firstName;
		private final String lastName;
		private Integer age;
		private String address;
		private String phone;

		public UserBuilder(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public UserBuilder age(Integer age) {
			this.age = age;
			return this;
		}

		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}

		public UserBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public User build() {
			User user = new User(this);
			return user;
		}

	}

}

public class Builder {
	public static void main(String[] args) {

		User user1 = new User.UserBuilder("Pritesh", "Gavali").address("Pune").phone("9876543211").age(25).build();
		System.out.println(user1);

		User user2 = new User.UserBuilder("Pritesh", "Gavali").address("Pune").phone("9876543211").build();
		System.out.println(user2);

		User user3 = new User.UserBuilder("Pritesh", "Gavali").address("Pune").build();
		System.out.println(user3);

		User user4 = new User.UserBuilder("Pritesh", "Gavali").build();
		System.out.println(user4);

	}
}
