import java.util.ArrayList;
import java.util.HashMap;

public class ListOfBike {

    private static HashMap<Integer, Bike> listOfBike = new HashMap<Integer, Bike>();

    public static boolean addBike(int bikeNo, Bike b) {
        if (listOfBike.containsKey(bikeNo))
            return false;
        else {
            listOfBike.put(bikeNo, b);
            return true;
        }
    }

    public static boolean deleteBike(int bikeNo) {
        if (!listOfBike.containsKey(bikeNo))
            return false;
        else {
            listOfBike.remove(bikeNo);
            return true;
        }
    }

    public static boolean checkBike(int bikeNo) {
        if (listOfBike.get(bikeNo) == null)
            return false;
        else
            return true;
    }

    public static int getSize() {
        return listOfBike.size();
    }

    public static ArrayList<Bike> searchbike(DateRange dateRange, BikeTypeEnum bikeType, Location location) {
        ArrayList<Bike> result = new ArrayList<Bike>();
        for (int i = 0; i < listOfBike.size(); i++) {
            if (listOfBike.get(i) != null) {
                boolean a = true;
                Bike b = listOfBike.get(i);
                ArrayList<DateRange> rds = b.getRentedDate();
                for (int j = 0; j < rds.size(); j++) {
                    DateRange rd = rds.get(j);
                    if (dateRange.overlaps(rd)) {
                        a = false;
                    }
                }
                if(b.getType().getType() != bikeType) {
                    a = false;
                }
                if(! b.getProvider().getShopAddress().isNearTo(location)) {
                    a = false;
                }
                if(a) {
                    result.add(b);
                }
            }
        }
        return result;
    }

}
