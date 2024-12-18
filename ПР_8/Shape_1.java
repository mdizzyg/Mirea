package ПР_8;

import java.awt.*;

public abstract class Shape_1 {
    protected Color color;
    protected int x;
    protected int y;

    public Shape_1(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    // Абстрактный метод для рисования фигуры
    public abstract void draw(Graphics g);
}

