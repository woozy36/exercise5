//Joseph Momot exercise 5


import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

    ContactInfo person1 = new ContactInfo("john", "johngotti@gmail.com");
    ContactInfo person2 = new ContactInfo("ANDREW", "AndrewSemthehuman@gmail.com");

    System.out.println(person1);
    System.out.println(person2);

    HashMap<String, String> stuffICantLearn = new HashMap<String, String >();

    AddressBook book1 = new AddressBook(stuffICantLearn);


    book1.addingContacts(person1);
        System.out.println(book1);

    book1.addingContacts(person2);
        System.out.println(book1);



    }
}