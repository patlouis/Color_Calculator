package colorcalculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorCalculator {

    private JFrame f;
    private JPanel p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
    private JLabel l1, l2, l3, l4;
    private JTextField tf1, tf2, tf3, tf4;
    private JButton b1, b2;

    public ColorCalculator() {

        // containers
        f = new JFrame("My Color Calculator");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        p6 = new JPanel();
        p7 = new JPanel();
        p8 = new JPanel();
        p9 = new JPanel();
        p10 = new JPanel();

        // components
        l1 = new JLabel("Red: ");
        l2 = new JLabel("Green: ");
        l3 = new JLabel("Blue: ");
        l4 = new JLabel("Alpha: ");
        tf1 = new JTextField("0", 15);
        tf2 = new JTextField("0", 15);
        tf3 = new JTextField("0", 15);
        tf4 = new JTextField("0", 15);
        b1 = new JButton("Compute");
        b2 = new JButton("Clear");

    }

    public void startApp() {

        p1.add(l1);
        p1.add(tf1);
        p2.add(l2);
        p2.add(tf2);
        p3.add(l3);
        p3.add(tf3);
        p4.add(l4);
        p4.add(tf4);
        p5.add(b1);
        p5.add(b2);

        f.setLayout(new GridLayout(10, 2));

        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.add(p4);
        f.add(p5);
        f.add(p6);
        f.add(p7);
        f.add(p8);
        f.add(p9);
        f.add(p10);

        b1.addActionListener(new ActionPerformed());
        b2.addActionListener(new ActionPerformed());
        f.addWindowListener(new CloseButtonHandler());

        p6.setPreferredSize(new Dimension(250, 200));
        p7.setPreferredSize(new Dimension(250, 200));
        p8.setPreferredSize(new Dimension(250, 200));
        p9.setPreferredSize(new Dimension(250, 200));
        p10.setPreferredSize(new Dimension(250, 200));

        f.setLocationRelativeTo(null);
        f.setSize(400, 300);
        f.setVisible(true);

    }

    private class ActionPerformed implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            Object source = e.getSource();
            int num1 = Integer.parseInt(tf1.getText());
            int num2 = Integer.parseInt(tf2.getText());
            int num3 = Integer.parseInt(tf3.getText());
            int num4 = Integer.parseInt(tf4.getText());

            if (source == b1) {

                p6.setBackground(new Color(num1, num2, num3, num4));
                p7.setBackground(new Color(num1, num2, num3, num4));
                p8.setBackground(new Color(num1, num2, num3, num4));
                p9.setBackground(new Color(num1, num2, num3, num4));
                p10.setBackground(new Color(num1, num2, num3, num4));

            } else if (source == b2) {
                
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
                tf4.setText("");
                
                p6.setBackground(new Color(0, 0, 0, 0));
                p7.setBackground(new Color(0, 0, 0, 0));
                p8.setBackground(new Color(0, 0, 0, 0));
                p9.setBackground(new Color(0, 0, 0, 0));
                p10.setBackground(new Color(0, 0, 0, 0));

            } else {

            }
        }
    }

    private class CloseButtonHandler extends WindowAdapter {

        public void closeWindow(WindowEvent we) {
            System.exit(0);
        }
    }

    public static void main(String args[]) {

        ColorCalculator frame = new ColorCalculator();
        frame.startApp();

    }
}
