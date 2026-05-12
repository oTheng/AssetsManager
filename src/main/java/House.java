import java.util.List;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquried,
                 double orginialCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquried, orginialCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double pricePerSquareFoot = 0;

        if (condition == 1) {
            pricePerSquareFoot = 180;
        } else if (condition == 2) {
            pricePerSquareFoot = 130;
        } else if (condition == 3) {
            pricePerSquareFoot = 90;
        } else if (condition == 4) {
            pricePerSquareFoot = 80;
        }

        double houseValue = this.squareFoot * pricePerSquareFoot;
        double lotValue = this.lotSize * 0.25;

        return houseValue + lotValue;
    }
}