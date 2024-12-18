package ПР_8;

import java.awt.*;

public class Rectangle_1 extends Shape_1 {
    private int width;
    private int height;

    public Rectangle_1(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
