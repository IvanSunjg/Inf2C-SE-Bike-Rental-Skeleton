import java.math.BigDecimal;
import java.util.Collection;
import java.time.temporal.ChronoUnit;

public class MultidayDiscountPolicy implements PricingPolicy {
    
    @Override
    public void setDailyRentalPrice(BikeType bikeType, BigDecimal dailyPrice) {
        bikeType.setDailyPrice(dailyPrice);
    }

    @Override
    public BigDecimal calculatePrice(Collection<Bike> bikes, DateRange duration) {
        BigDecimal price = new BigDecimal(0);
        BigDecimal fivediscount = new BigDecimal(0.95);
        BigDecimal tendiscount = new BigDecimal(0.9);
        BigDecimal fifteendiscount = new BigDecimal(0.85);
        for(Bike b: bikes) {
            long days = ChronoUnit.DAYS.between(duration.getEnd(),duration.getStart());
            if(days<=2) {
                price.add(b.getType().getDailyPrice().multiply(new BigDecimal(days)));
            }else if(days<=6 && days>=3) {
                price.add(b.getType().getDailyPrice().multiply(fivediscount).multiply(new BigDecimal(days)));
            }else if(days<=13 && days>=7){
                price.add(b.getType().getDailyPrice().multiply(tendiscount).multiply(new BigDecimal(days)));
            }else if(days>=14) {
                price.add(b.getType().getDailyPrice().multiply(fifteendiscount).multiply(new BigDecimal(days)));
            }else {
                throw new IllegalArgumentException("duration is invalid!");
            }
        }
        return price;
    }

}
