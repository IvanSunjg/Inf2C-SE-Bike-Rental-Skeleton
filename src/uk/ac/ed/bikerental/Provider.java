
import java.util.ArrayList;
import java.util.HashMap;

public class Provider {

    private String firstName;
    private String surName;
    private double depositR;
    private HashMap<Integer, Bike> listOfBikes;
    private ArrayList<Provider> partners;
    private String openT;
    private String contactNo;
    private Location shopAddress;
    private HashMap<Integer, Booking> listOfBook;
    private String emailAddress;
    private String shopName;

    public Provider(String firstName, String surName, double depositR, String openT, String contactNo, String emailAddress,
            String shopName, String postCode, String strAddress) {
        this.firstName = firstName;
        this.surName = surName;
        this.depositR = depositR;
        this.openT = openT;
        this.contactNo = contactNo;
        this.emailAddress = emailAddress;
        this.shopName = shopName;
        shopAddress = new Location(postCode, strAddress);
        listOfBikes = new HashMap<Integer, Bike>();
        listOfBook = new HashMap<Integer, Booking>();
        partners = new ArrayList<Provider>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public double getDepositR() {
        return depositR;
    }

    public void setDepositR(double depositR) {
        this.depositR = depositR;
    }

    public HashMap<Integer, Bike> getListOfBikes() {
        return listOfBikes;
    }

    public void setListOfBikes(HashMap<Integer, Bike> listOfBikes) {
        this.listOfBikes = listOfBikes;
    }

    public String getOpenT() {
        return openT;
    }

    public void setOpenT(String openT) {
        this.openT = openT;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public ArrayList<Provider> getPartners() {
        return partners;
    }

    public void setPartners(ArrayList<Provider> partners) {
        this.partners = partners;
    }

    public Location getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(Location shopAddress) {
        this.shopAddress = shopAddress;
    }

    public HashMap<Integer, Booking> getListOfBook() {
        return listOfBook;
    }

    public void setListOfBook(HashMap<Integer, Booking> listOfBook) {
        this.listOfBook = listOfBook;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public boolean addPartner(Provider p) {
        partners.add(p);
        return true;
    }

    public boolean deletePartner(Provider p) {
        if (partners.contains(p)) {
            partners.remove(p);
            return true;
        }
        return false;
    }

    public boolean addBike(Bike b) {
        for (int n = 0; n < ListOfBike.getSize(); n++) {
            if (!ListOfBike.checkBike(n)) {
                b.setBikeNo(n);
                ListOfBike.addBike(n, b);
                listOfBikes.put(n, b);
                return true;
            }
        }
        int n = ListOfBike.getSize();
        b.setBikeNo(n);
        ListOfBike.addBike(n, b);
        listOfBikes.put(n, b);
        return true;
    }
    public boolean deleteBike(int n, Bike b) {
        if (ListOfBike.checkBike(n)) {
            listOfBikes.remove(n, b);
            ListOfBike.deleteBike(n);
            return true;
        }
        return false;
    }
    public boolean updateBike(int n, Bike b) {
        if (ListOfBike.checkBike(n)) {
            listOfBikes.replace(n, b);
            ListOfBike.deleteBike(n);
            ListOfBike.addBike(n, b);
            return true;
        }
        return false;
    }
    public boolean confirmreturn() {
        return true;
    }
    public boolean upDateBooking() {
        return true;
    }
}
