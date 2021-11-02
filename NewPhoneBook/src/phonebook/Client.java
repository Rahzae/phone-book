package phonebook;

import java.util.Scanner;

public class Client {
	static String firstName, lastName, phoneNum, street, city, zip, state;

	static int option;

	static String search;

	static String[] savePerson = {};

	static Person contact;

	static int selection;

	static String searchCard;


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int choice;
		do {
			menu();
			choice = input.nextInt();
			switch (choice) {

			case 1:
				if (choice == 1) {
					String[] temp = new String[savePerson.length + 1];
					for (int i = 0; i < savePerson.length; i++) {
						temp[i] = savePerson[i];

					}
					String temp2 = addPerson();
					System.out.println("Contact added: " + temp2);
					temp[temp.length - 1] = temp2;
					savePerson = temp;
					break;
				}

			case 2:
				if (choice == 2) {
					System.out.println("\nSearch: ");
					searchContact(selection, searchCard);
					break;
				}

			case 3:
				if (choice == 3) {
					System.out.println("\nEnter phone number to Remove: ");
					updateOrDelete(searchCard);

				}
			}

		} while (choice != 0);
	}

	public static void menu() {
		System.out.println("\n\n**** Welcome to PhoneBook ****\n\n");
		System.out.println("\nPress: 1 add contact  -  2 search  -  3 delete -  4 exit:");

	}

	public static String addPerson() {
		Scanner input = new Scanner(System.in);
		System.out.println("\nEnter First name: ");
		firstName = input.nextLine();
		System.out.println("\nEnter Last name: ");
		lastName = input.nextLine();
		System.out.println("\nEnter PhoneNumber: ");
		phoneNum = input.nextLine();
		System.out.println("\nEnter Street: ");
		street = input.nextLine();
		System.out.println("\nEnter City: ");
		city = input.nextLine();
		System.out.println("\nEnter State: ");
		state = input.nextLine();
		System.out.println("\nEnter Zip: ");
		zip = input.nextLine();

		contact = new Person(firstName, lastName, phoneNum, street, city, state, zip);
		String result = contact.getFirstName() + " " + contact.getLastName() + ", " + "("
				+ contact.getPhoneNum().substring(0, 3) + ") " + contact.getPhoneNum().substring(3, 6) + "-"
				+ contact.getPhoneNum().substring(6, 10) + ", " + contact.address.getStreet() + ", "
				+ contact.address.getCity() + ", " + contact.address.getState() + " " + contact.address.getZip();

		return result;
	}

	public static void searchContact(int select, String str) {

		Scanner input = new Scanner(System.in);
		System.out.println(
				"\n1. Search contact by phone number:\n2. Search contact by name, street, city, state, or zip code\n3. Return to main menu:");
		select = input.nextInt();

		for (int i = 0; i < savePerson.length; i++) {
			if (select == 1) {
				System.out.println("Enter contact phone number:");
				str = input.next();
				str = "(" + str.substring(0, 3) + ") " + str.substring(3, 6) + "-" + str.substring(6, 10);
				if (savePerson[i].contains(str)) {
					System.out.println("Contact: " + savePerson[i]);
				}

				break;

			} else if (select == 2) {
				System.out.println("\nEnter Contact info:");
				str = input.next();
				if (savePerson[i].contains(str)) {
					System.out.println("Contact: " + savePerson[i]);
					
					break;
				} else {
					System.out.println("contact not found");
					break;
				}

			} else if (select == 3) {
				break;
			}
		}
	}

	public static void updateOrDelete(String str) {
		Scanner input = new Scanner(System.in);
		str = input.next();
		str = "(" + str.substring(0, 3) + ") " + str.substring(3, 6) + "-" + str.substring(6, 10);
		for(int i = 0; i < savePerson.length; i++) {
			if(savePerson[i].contains(str)) {
				savePerson[i] = null;
			System.out.println("\nContact deleted");
			break;
			}
		}
		
	}
}

