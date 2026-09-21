public class BuddyInfo {
    private String name;
    private String address;
    private Integer phone;

    public static void main(String[] args) {
        BuddyInfo buddyMe = new BuddyInfo();
        buddyMe.setName("Jojo");
        System.out.printf("Hello %s", buddyMe.getName());
    }
    public BuddyInfo() {
    }

    public BuddyInfo(String name, String address, Integer phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
}
