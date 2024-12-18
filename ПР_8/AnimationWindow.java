package ПР_8;
import javax.swing.*;
import java.awt.*;

public class AnimationWindow extends JFrame {
    public AnimationWindow(String imagePath) {
        setTitle("Image Viewer");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Загружаем изображение из указанного пути
        ImageIcon imageIcon = new ImageIcon(imagePath);
        JLabel imageLabel = new JLabel(imageIcon);

        // Добавляем изображение в окно
        add(imageLabel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        // Проверяем, указан ли путь к изображению
        if (args.length == 0) {
            System.out.println("/Users/mishanya/java_project/OOp/Mirea/ПР_8/th.jpeg");
            System.exit(1);
        }

        String imagePath = args[0]; // Берем путь к изображению из аргументов
        SwingUtilities.invokeLater(() -> {
            AnimationWindow window = new AnimationWindow(imagePath);
            window.setVisible(true);
        });
    }
}
