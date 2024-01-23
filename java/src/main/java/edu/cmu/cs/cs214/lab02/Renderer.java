package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Renderer {
    /**
     * Set it private.
     * In real world, the renderer doesn't need to know what the shape is.
     * As long as it is a some shape.
     */
    private Shape shape;

    /**
     * Set the constructor public.
     * @param shape
     */
    public Renderer(Shape shape) {
        this.shape = shape;
    }

    /**
     * Set the method public.
     */
    public void draw() {
        double area = shape.getArea();

        // assume implementation

        System.out.println("Shape printed\n" + "Its area is " + area);
    }
}
