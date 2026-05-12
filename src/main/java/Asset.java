public class Asset {
    private String description;
    private String dateAcquried;
    private double orginialCost;

    public Asset(String description, String dateAcquried, double orginialCost) {
        this.description = description;
        this.dateAcquried = dateAcquried;
        this.orginialCost = orginialCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAcquried() {
        return dateAcquried;
    }

    public void setDateAcquried(String dateAcquried) {
        this.dateAcquried = dateAcquried;
    }

    public double getOrginialCost() {
        return orginialCost;
    }

    public void setOrginialCost(double orginialCost) {
        this.orginialCost = orginialCost;
    }
    public double getValue(){

        return orginialCost;
    }
}
