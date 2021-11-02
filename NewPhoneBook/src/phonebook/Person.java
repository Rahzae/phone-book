package phonebook;

public class Person {	
		
		private String  firstName;
		private String  lastName;
		private String  phoneNum;
		Address address;  



		public Person (String firstName, String lastName, String phoneNum, String street, String city, String state, String zip) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNum = phoneNum;
			this.address =  new Address(street, city, state, zip);
			
		}


		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getFirstName () {
			return firstName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setPhoneNum (String phoneNum) {
			this.phoneNum = phoneNum;
		}

		public String getPhoneNum () {
			return phoneNum;
		}


		public void setAddress(Address address) {
			this.address = address;
		}


		public Address getAddress() {
			return address;
		}


}
