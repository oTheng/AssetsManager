public class Asset {
    private String description;
    private String dateAcquried;
    private double originalCost;

    public Asset(String description, String dateAcquried, double orginialCost) {
        this.description = description;
        this.dateAcquried = dateAcquried;
        this.originalCost = orginialCost;
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

    public double getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(double orginialCost) {
        this.originalCost = orginialCost;
    }
    public double getValue(){

        return originalCost;
    }
}
