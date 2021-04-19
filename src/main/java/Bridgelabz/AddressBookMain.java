package Bridgelabz;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.printf("Welcome to AddressBook Program.\n\n");

        Scanner sc = new Scanner(System.in);

        AddressBook book1 = new AddressBook("Book1");
        book1.addContact(sc);
        book1.addContact(sc);

        book1.displayBook(book1);
        List<Contact> contactList;

        public static void main(String[] args) {
            System.out.println("Welcome to Address Book Program");
        }

        public boolean addContact(Contact contact) {
            List<Contact> contactList = new ArrayList<>();
            try {
                contactList.add(contact);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return false;
        }

    }
}