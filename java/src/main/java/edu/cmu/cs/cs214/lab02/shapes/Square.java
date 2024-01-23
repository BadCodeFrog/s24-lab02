package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    /**
     * Set it private.
     */
    private double sideLen;

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }

    @Override
    public double getArea() {
        return sideLen * sideLen;
    }
}
