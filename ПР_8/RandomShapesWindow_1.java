package ПР_8;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomShapesWindow_1 extends JPanel {
    private List<Shape_1> shapes = new ArrayList<>();
    private Random random = new Random();

    public RandomShapesWindow_1() {
        // Создаём 20 случайных фигур
        for (int i = 0; i < 20; i++) {
            shapes.add(createRandomShape());
        }
    }

    private Shape_1 createRandomShape() {
        Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        int x = random.nextInt(400);
        int y = random.nextInt(400);

        if (random.nextBoolean()) {
            // Создать круг
            int radius = random.nextInt(50) + 10;
            return new Circle_1(color, x, y, radius);
        } else {
            // Создать прямоугольник
            int width = random.nextInt(100) + 10;
            int height = random.nextInt(100) + 10;
            return new Rectangle_1(color, x, y, width, height);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Рисуем все фигуры
        for (Shape_1 shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        RandomShapesWindow_1 panel = new RandomShapesWindow_1();

        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
