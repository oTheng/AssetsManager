import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Asset> assetsList = new ArrayList<>();
        assetsList.add(new House("My House","Jan 1, 2019", 201200, "255 Elmin str", 4, 1399, 15000));
        assetsList.add(new House("Vacation House","Jan 31, 2026", 502190, "812 Monda road", 1, 2394, 20));
        assetsList.add(new Vehicle("New car", "May 5, 2016", 21134, "Honda", 2025, 120000));
        assetsList.add(new Vehicle("old truck", "December 24, 2001", 12244, "Ford", 2025, 223000));

        for (Asset asset : assetsList) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());

            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());
                System.out.println("Current Value: $" + house.getValue());
                System.out.println(house.getCondition());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Year: " + vehicle.getYear());
                System.out.println("Make/Model: " + vehicle.getMakeModel());
                System.out.println("Current Value: $" + vehicle.getValue());
            }
            System.out.println("-------------------------");
        }
    }
}