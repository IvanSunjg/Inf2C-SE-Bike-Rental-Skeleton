import java.math.BigDecimal;
import java.util.ArrayList;

public class Quote {
    
    private String customerName;
    private String providerName;
    private DateRange dateRange;
    private BigDecimal finalPrice;
    private BigDecimal deposit;
    private ArrayList<Location> availablePlace;
    private Bike bike;
    
    public Quote(String customerName,String providerName,DateRange dateRange,BigDecimal finalPrice,
            BigDecimal deposit,ArrayList<Location> availablePlace,Bike bike) {
        this.customerName = customerName;
        this.providerName = providerName;
        this.dateRange = dateRange;
        this.finalPrice = finalPrice;
        this.deposit = deposit;
        this.availablePlace = availablePlace;
        this.bike = bike;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getProviderName() {
        return providerName;
    }
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
    public DateRange getDateRange() {
        return dateRange;
    }
    public void setDateRange(DateRange dateRange) {
        this.dateRange = dateRange;
    }
    public BigDecimal getFinalPrice() {
        return finalPrice;
    }
    public void setFinalPrice(BigDecimal finalPrice) {
        this.finalPrice = finalPrice;
    }
    public BigDecimal getDeposit() {
        return deposit;
    }
    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }
    public ArrayList<Location> getVailablePlace() {
        return availablePlace;
    }
    public void setVailablePlace(ArrayList<Location> availablePlace) {
        this.availablePlace = availablePlace;
    }
    public Bike getBike() {
        return bike;
    }
    public void setBike(Bike bike) {
        this.bike = bike;
    }
    
    
    
}
