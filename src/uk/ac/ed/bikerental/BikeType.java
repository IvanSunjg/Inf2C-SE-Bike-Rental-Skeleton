//package uk.ac.ed.bikerental;

import java.math.BigDecimal;
//import java.util.Objects;

public class BikeType {
    
    private BigDecimal replacementValue;
    private BigDecimal dailyPrice;
    private BikeTypeEnum type;
    
    public BikeType(BigDecimal replacementValue,BikeTypeEnum type,BigDecimal dailyPrice) {
        this.replacementValue = replacementValue;
        this.type = type;
        this.dailyPrice = dailyPrice;
    }
    
    public void setType(BikeTypeEnum type) {
        this.type = type;
    }
    
    
    public BikeTypeEnum getType() {
        return type;
    }
    
    public BigDecimal getReplacementValue() {
        return replacementValue;
    }

    public BigDecimal getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(BigDecimal dailyPrice) {
        this.dailyPrice = dailyPrice;
    }
}