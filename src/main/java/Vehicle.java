import java.time.LocalDate;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;


    public Vehicle(String description, String dateAcquried, double orginialCost,
                   String makeModel, int year, int odometer) {
        super(description, dateAcquried, orginialCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    @Override
    public double getValue() {
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - year;

        double value;

        if (age >= 0 && age <= 3) {
            value = getOriginalCost() * (1 - (0.03 * age));
        } else if (age <= 6) {
            value = getOriginalCost() * (1 - (0.06 * age));
        } else if (age <= 10) {
            value = getOriginalCost() * (1 - (0.08 * age));
        } else {
            value = 1000.00;
        }

        if (odometer > 100000 && !makeModel.toLowerCase().contains("honda") && !makeModel.toLowerCase().contains("toyota")) {

            value = value * 0.75;
        }
        return value;
    }
}
