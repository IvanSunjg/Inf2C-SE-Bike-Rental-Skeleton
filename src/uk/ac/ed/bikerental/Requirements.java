import java.time.LocalDate;
import java.util.ArrayList;

public class Requirements {
      
    private DateRange  dateRange;
    private BikeTypeEnum bikeType;
    private Location location;
    private int numberOfBikes;
    private String customerName;
    
    public Requirements(DateRange dateRange,BikeTypeEnum bikeType,Location location,int numberOfBikes,String customerName) {
        this.setDateRange(dateRange);
        this.setBikeType(bikeType);
        this.setLocation(location);
        this.setNumberOfBikes(numberOfBikes);
        this.setCustomerName(customerName);
    }

    public DateRange getDateRange() {
        return dateRange;
    }

    public void setDateRange(DateRange dateRange) {
        this.dateRange = dateRange;
    }

    public BikeTypeEnum getBikeType() {
        return bikeType;
    }

    public void setBikeType(BikeTypeEnum bikeType) {
        this.bikeType = bikeType;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getNumberOfBikes() {
        return numberOfBikes;
    }

    public void setNumberOfBikes(int numberOfBikes) {
        this.numberOfBikes = numberOfBikes;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public ArrayList<Quote> getQuote(){
        ArrayList<Quote> result = new ArrayList<Quote>();
        ArrayList<Bike> bs = ListOfBike.searchbike(dateRange, bikeType, location);
        for(int i=0;i<bs.size();i++) {
            Bike b = bs.get(i);
            ArrayList<Location> availablelocation = new ArrayList<Location>();
            availablelocation.add(b.getProvider().getShopAddress());
            ArrayList<Provider> partners = b.getProvider().getPartners();
            for(int j = 0;j<partners.size();j++) {
                availablelocation.add(partners.get(j).getShopAddress());
            }
            MultidayDiscountPolicy m = new MultidayDiscountPolicy();
            DepositPolicy d = new DepositPolicy();
            LocalDate localDate = LocalDate.now();
            ArrayList<Bike> bb = new ArrayList<Bike>();
            bb.add(b);
            Quote q = new Quote(customerName,b.getProvider().getFirstName()+" "+b.getProvider().getSurName(),dateRange,
                   m.calculatePrice(bb,dateRange),d.calculateValue(b,localDate),availablelocation,b);
            result.add(q);
        }
        return result;
    }
}
