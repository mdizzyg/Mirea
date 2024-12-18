package ПР_8;

import java.awt.*;

public class Circle_1 extends Shape_1 {
    private int radius;

    public Circle_1(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius * 2, radius * 2);
    }
}
