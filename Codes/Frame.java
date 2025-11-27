/*
 * Written by Daniya Walker
 */

public class Frame {


    // Instance Variables
    private double size; 
    private String type; 

    // Default values
    private static final double DEFAULT_SIZE = 18.5;
    private static final String DEFAULT_TYPE = "Diamond";

    // Default constructor
    public Frame() {
        this.size = DEFAULT_SIZE;
        this.type = DEFAULT_TYPE;
    }

    // Parameterized constructor 
    public Frame(double size, String type) {
        setSize(size);
        setType(type);
    }

    // Accessors
    public double getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public void setSize(double size) {
        if (size >= 18.5 && size <= 60.0) {
            this.size = size;
        } else {
            this.size = DEFAULT_SIZE;
        }
    }

    public void setType(String type) {
        if (type != null && 
            (type.equals("Diamond") || type.equals("Step-Through") ||
             type.equals("Truss") || type.equals("Penny-Farthing"))) {
            this.type = type;
        } else {
            this.type = DEFAULT_TYPE;
        }
    }

    public boolean equals(Frame other) {
        if (other == null) return false;
        return this.size == other.size && this.type.equals(other.type);
    }

    public String toString() {
        return "[Frame] Size: " + size + " Type: " + type;
    }
}
