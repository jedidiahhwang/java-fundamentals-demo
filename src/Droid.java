public class Droid {
    private String serialNumber;
    private String modelType;

    public Droid(String serialNumber, String modelType) {
        this.serialNumber = serialNumber;
        this.modelType = modelType;
    }

    // Getter methods
    public String getSerialNumber() {return serialNumber;}
    public String getModelType() {return modelType;}

    // Setter methods
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    // toString method - returns a string representation of an object
    @Override
    public String toString() {
        return getSerialNumber() + ",  " + getModelType();
    }

    // Speak method
    public void speak() {
        System.out.println("Hello there.");
    }
}
