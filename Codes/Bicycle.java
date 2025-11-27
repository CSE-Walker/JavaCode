/*
 * Written by Daniya Walker
 * Bicycle class combines a make, two wheels, and a frame into one object.
 */

public class Bicycle {
	
    // Instance Variables
    private String make;      
    private Wheel frontWheel;  
    private Wheel backWheel;   
    private Frame frame;      

    // Default values
    private static final String DEFAULT_MAKE = "none";
    private static final Wheel DEFAULT_WHEEL = new Wheel();
    private static final Frame DEFAULT_FRAME = new Frame();

    // Default constructor
    public Bicycle() {
        this.make = DEFAULT_MAKE;
        this.frontWheel = new Wheel();
        this.backWheel = new Wheel();
        this.frame = new Frame();
    }

    // Parameterized constructor 
    public Bicycle(String make, Wheel frontWheel, Wheel backWheel, Frame frame) {
        setMake(make);
        setFrontWheel(frontWheel);
        setBackWheel(backWheel);
        setFrame(frame);
    }

    // Accessors
    public String getMake() {
        return make;
    }

    public Wheel getFrontWheel() {
        return frontWheel;
    }

    public Wheel getBackWheel() {
        return backWheel;
    }

    public Frame getFrame() {
        return frame;
    }

    public void setMake(String make) {
        if (make != null && !make.trim().isEmpty()) {
            this.make = make;
        } else {
            this.make = DEFAULT_MAKE;
        }
    }

    public void setFrontWheel(Wheel frontWheel) {
        if (frontWheel != null) {
            this.frontWheel = frontWheel;
        } else {
            this.frontWheel = new Wheel();
        }
    }

    public void setBackWheel(Wheel backWheel) {
        if (backWheel != null) {
            this.backWheel = backWheel;
        } else {
            this.backWheel = new Wheel();
        }
    }

    public void setFrame(Frame frame) {
        if (frame != null) {
            this.frame = frame;
        } else {
            this.frame = new Frame();
        }
    }

    public boolean equals(Bicycle other) {
        if (other == null) return false;

        boolean sameMake = this.make.equalsIgnoreCase(other.make);
        boolean sameFront = this.frontWheel.equals(other.frontWheel);
        boolean sameBack = this.backWheel.equals(other.backWheel);
        boolean sameFrame = this.frame.equals(other.frame);

        return sameMake && sameFront && sameBack && sameFrame;
    }

    public String toString() {
        return "[Bicycle] Make: " + make + 
               " Front Wheel: " + frontWheel + 
               " Back Wheel: " + backWheel + 
               " Frame: " + frame;
    }
}
