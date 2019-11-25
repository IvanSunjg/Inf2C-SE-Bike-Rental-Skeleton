import java.math.BigDecimal;
import java.util.ArrayList;

public class Customer {
    
    private String firstName;
    private String surName;
    private Location address;
    private int currentBooking;
    private String contactNo;
    private String emailAddress;
    
    public Customer(String firstName,String surName,String postCode,String strAddress,String contactNo,String emailAddress) {
        this.setFirstName(firstName);
        this.setSurName(surName);
        address = new Location(postCode,strAddress);
        setCurrentBooking(0);
        this.setContactNo(contactNo);
        this.setEmailAddress(emailAddress);
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

    public Location getAddress() {
        return address;
    }

    public void setAddress(Location address) {
        this.address = address;
    }

    public int getCurrentBooking() {
        return currentBooking;
    }

    public void setCurrentBooking(int currentBooking) {
        this.currentBooking = currentBooking;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    public ArrayList<Quote> getQuote(DateRange d,BikeTypeEnum t,Location l,int numberOfBike){
        Requirements r = new Requirements(d,t,l,numberOfBike,firstName+" "+surName);
        return r.getQuote();
    }
    
    public Booking bookQuote(ArrayList<Quote> qs, boolean delivery) {
        ArrayList<Bike> bs = new ArrayList<Bike>();
        BigDecimal finalDeposit = new BigDecimal(0);
        for (Quote q: qs) {
            bs.add(q.getBike());
            finalDeposit.add(q.getDeposit());
        }
        MultidayDiscountPolicy m = new MultidayDiscountPolicy();
        Booking b = new Booking(0,firstName+" "+surName,qs.get(0).getDateRange(),delivery,
                m.calculatePrice(bs, qs.get(0).getDateRange()),finalDeposit,true,bs);
        return b;
    }
}
