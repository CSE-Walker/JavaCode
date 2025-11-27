/*
 * Written by Daniya Walker
 * Wheel class represents a wheel with diameter and width
 */

public class Wheel {

    // Instance Variables
    private double diameter;
    private double width;

    // Default values
    private static final double DEFAULT_DIAMETER = 16.0;
    private static final double DEFAULT_WIDTH = 1.0;

    // Default constructor sets default values
    public Wheel() {
        this.diameter = DEFAULT_DIAMETER;
        this.width = DEFAULT_WIDTH;
    }

    // Parameterized constructor with validation
    public Wheel(double diameter, double width) {
        setDiameter(diameter);
        setWidth(width);
    }

    // Accessors
    public double getDiameter() {
        return diameter;
    }

    public double getWidth() {
        return width;
    }

    public void setDiameter(double diameter) {
        if (diameter >= 16.0 && diameter <= 55.0) {
            this.diameter = diameter;
        } else {
            this.diameter = DEFAULT_DIAMETER; // Reset to default if invalid
        }
    }

    public void setWidth(double width) {
        if (width >= 1.0 && width <= 2.5) {
            this.width = width;
        } else {
            this.width = DEFAULT_WIDTH; // Reset to default if invalid
        }
    }

    public boolean equals(Wheel other) {
        if (other == null) return false;
        return this.diameter == other.diameter && this.width == other.width;
    }

    public String toString() {
        return "[Wheel] Diameter: " + diameter + " Width: " + width;
    }
}
