import java.util.ArrayList;
//testing lab step 17. adding some text

public class AddressBook {

    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<BuddyInfo>();
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo ("Java", "Ontario", 825);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
        System.out.println("Address Book");
    }

    public void addBuddy(BuddyInfo buddy){
        buddies.add(buddy);
    }
    public void removeBuddy(BuddyInfo buddy){

        buddies.remove(buddy);
    }
}


