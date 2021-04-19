package Bridgelabz;

public class Contact {

    public String firstName, lastName, address, city, state, email;
    public int zipCode;
    public long phoneNumber;


    public Contact(String fisrtName, String lastName, String address, String city,
                   String state, String email,
                   int zipCode, long phoneNumber)
    {
        super();
        this.firstName = fisrtName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
    }

}