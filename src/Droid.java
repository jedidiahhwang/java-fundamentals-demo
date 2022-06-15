public class Droid {
    private String serialNumber;
    private String modelType;
    private String purpose;

    public Droid(String serialNumber, String modelType, String purpose) {
        this.serialNumber = serialNumber;
        this.modelType = modelType;
        this.purpose = purpose;
    }

    // Getter methods
    public String getSerialNumber() {return serialNumber;}
    public String getModelType() {return modelType;}
    public String getPurpose() {return purpose;}

    // Setter methods
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    // toString method - returns a string representation of an object
    @Override
    public String toString() {
        return getSerialNumber() + ",  " + getModelType() + ", " + getPurpose();
    }

    // Speak method
    public void speak() {
        System.out.println("Hello there.");
    }
}
