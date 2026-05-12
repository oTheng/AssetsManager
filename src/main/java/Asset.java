public class Asset {
    private String description;
    private String dateAcquired;
    private double originalCost;

    public Asset(String description, String dateAcquried, double orginialCost) {
        this.description = description;
        this.dateAcquired = dateAcquried;
        this.originalCost = orginialCost;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
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
