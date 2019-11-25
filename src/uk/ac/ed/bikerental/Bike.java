import java.util.ArrayList;

public class Bike {
	
	private int age;
	private BikeType type;
	private Provider provider;
	private int bikeNo;
	private String condition;
	private ArrayList<DateRange> rentedDate;
	
	
	
	public Bike(int age,BikeType type,Provider provider,int bikeNo,String condition) {
		this.setAge(age);
		this.setType(type);
		this.setProvider(provider);
		this.setBikeNo(bikeNo);
		this.setCondition(condition);
		rentedDate = new ArrayList<DateRange>();
	}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BikeType getType() {
        return type;
    }

    public void setType(BikeType type) {
        this.type = type;
    }

    public int getBikeNo() {
        return bikeNo;
    }

    public void setBikeNo(int bikeNo) {
        this.bikeNo = bikeNo;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public ArrayList<DateRange> getRentedDate() {
        return rentedDate;
    }

    public void setRentedDate(ArrayList<DateRange> rentedDate) {
        this.rentedDate = rentedDate;
    }
    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    
    
}
