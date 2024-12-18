package ПР_8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballMatch extends JFrame {
    private int milanScore = 0;
    private int madridScore = 0;

    public FootballMatch() {
        // Настройка окна
        setTitle("Football Match");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Создание компонентов
        JLabel result = new JLabel("Result: 0 : 0");
        result.setBounds(150, 20, 200, 20);

        JLabel lastScorer = new JLabel("Last Scorer: N/A");
        lastScorer.setBounds(150, 50, 200, 20);

        JLabel winner = new JLabel("Winner: DRAW");
        winner.setBounds(150, 80, 200, 20);

        JButton milanButton = new JButton("AC Milan");
        milanButton.setBounds(50, 120, 120, 30);

        JButton madridButton = new JButton("Real Madrid");
        madridButton.setBounds(220, 120, 120, 30);

        // Добавление действий для кнопок
        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                result.setText("Result: " + milanScore + " X " + madridScore);
                lastScorer.setText("Last Scorer: AC Milan");
                updateWinner(winner);
            }
        });

        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                result.setText("Result: " + milanScore + " X " + madridScore);
                lastScorer.setText("Last Scorer: Real Madrid");
                updateWinner(winner);
            }
        });

        // Добавление компонентов в окно
        add(result);
        add(lastScorer);
        add(winner);
        add(milanButton);
        add(madridButton);
    }

    private void updateWinner(JLabel winner) {
        if (milanScore > madridScore) {
            winner.setText("Winner: AC Milan");
        } else if (madridScore > milanScore) {
            winner.setText("Winner: Real Madrid");
        } else {
            winner.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        new FootballMatch().setVisible(true);
    }
}
