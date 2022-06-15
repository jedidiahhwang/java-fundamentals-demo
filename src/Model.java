public class Model {
    private String type;
    private String purpose;

    public Model (String type, String purpose) {
        this.type = type;
        this.purpose = purpose;
    }

    // Getter methods
    public String getType() {return type;}
    public String getPurpose() {return purpose;}

    // Setter methods
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setType(String type) {
        this.type = type;
    }

    // toString method - returns a string representation of an object
    @Override
    public String toString() {
        return getType() + ",  " + getPurpose();
    }
}
