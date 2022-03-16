package swing.deposit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    public static void main(String[] args) {
        JFrame win = new JFrame();

        JTextField sum = new JTextField();
        JTextField term = new JTextField();
        JTextField percent = new JTextField();

        JLabel sumlabel = new JLabel("Внесенная сумма");
        JLabel termLabel = new JLabel("Срок депозита(мес)");
        JLabel percentLabel = new JLabel("Процентная ставка");
        JLabel resulLabel = new JLabel("Доход");
        JLabel resul = new JLabel();

        JButton res = new JButton("Расчитать");

        JPanel textPanel = new JPanel(new FlowLayout());
        textPanel.setLayout(new GridLayout(4, 2));
        textPanel.add(sumlabel);
        textPanel.add(sum);
        textPanel.add(termLabel);
        textPanel.add(term);
        textPanel.add(percentLabel);
        textPanel.add(percent);
        textPanel.add(resulLabel);
        textPanel.add(resul);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(res);


        win.add(textPanel);
        win.add(buttonPanel, BorderLayout.SOUTH);
        win.setVisible(true);
        win.setTitle("Прибыль от дипозита");
        win.setSize(400,400);
        win.setDefaultCloseOperation(EXIT_ON_CLOSE);

        res.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(sum.getText());
                double b = Double.parseDouble(term.getText());
                double c = Double.parseDouble(percent.getText());

                double r = a + (((a*(b/100))/12)*c);
                String total = String.valueOf(r);
                resul.setText(total);
            }
        });

    }
}
