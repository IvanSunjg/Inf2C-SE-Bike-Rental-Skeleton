package uk.ac.ed.bikerental;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Booking {
    
    private int orderNo;
    private String customerName;
    private DateRange dateRange;
    private boolean delivery;
    private BigDecimal deposit;
    private BigDecimal finalPrice;
    //private ArrayList<Location> availablePlace;
    private boolean bookingStatus;
    private ArrayList<Bike> bikes;
    
    public Booking(int orderNo,String customerName,DateRange dateRange,boolean delivery,BigDecimal deposit,BigDecimal finalPrice
           ,boolean bookingStatus,ArrayList<Bike> bikes) {
        this.orderNo = orderNo;
        this.customerName = customerName;
        this.dateRange = dateRange;
        this.delivery = delivery;
        this.deposit = deposit;
        this.finalPrice = finalPrice;
        //this.availablePlace =  availablePlace;
        this.bookingStatus = bookingStatus;
        this.bikes = bikes;
        
    }
    
    public int getOrderNo() {
        return orderNo;
    }
    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public DateRange getDateRange() {
        return dateRange;
    }
    public void setDateRange(DateRange dateRange) {
        this.dateRange = dateRange;
    }
    public boolean isDelivery() {
        return delivery;
    }
    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }
    public BigDecimal getDeposit() {
        return deposit;
    }
    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }
    public BigDecimal getFinalPrice() {
        return finalPrice;
    }
    public void setFinalPrice(BigDecimal finalPrice) {
        this.finalPrice = finalPrice;
    }
    public boolean getBookingStatus() {
        return bookingStatus;
    }
    public void setBookingStatus(boolean bookingStatus) {
        this.bookingStatus = bookingStatus;
    }
    public ArrayList<Bike> getBike() {
        return bikes;
    }
    public void setBike(ArrayList<Bike> bikes) {
        this.bikes = bikes;
    }
    
    
    
}
