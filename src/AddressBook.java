import java.util.HashMap;

public class AddressBook {

    private HashMap<String, String> phoneBook;

    public AddressBook(HashMap<String, String> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public void addingContacts(ContactInfo a){
        phoneBook.put(a.getName(), a.getEmail());
    }


    @Override
    public String toString() {
        return "AddressBook{" +
                "phoneBook=" + phoneBook +
                '}';
    }
}
