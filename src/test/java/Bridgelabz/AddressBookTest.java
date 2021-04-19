package Bridgelabz;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddressBookTest {

    private AddressBookMain addressBookMain;

    @Before
    public void CreatedAdressBook() {
        AddressBookMain addressBookMain = new AddressBookMain();
    }

    @Test
    public void givenContact_WhenAddedToAddressBook_ShouldReturn_true(){
        Contact contact = new Contact("Nagireddy", "Somula", "1-15", "Kurnool", "Andhra", "somulanagireddy@gmail.com", "518134", "9492880337");
        boolean Isadded = addressBookMain.addContact(contact);
        Assertions.assertTrue(Isadded);
    }
}