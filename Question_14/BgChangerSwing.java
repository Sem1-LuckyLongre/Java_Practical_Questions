import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// Code Runner
public class BgChangerSwing {
    JButton b1, b2;

    public BgChangerSwing() {
        JFrame panel = new JFrame();
        panel.setTitle("Background Changer using Swing");
        panel.setSize(300, 300);
        panel.setLayout(null);
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setVisible(true);

        b1 = new JButton("RED");
        b1.setBounds(30, 100, 100, 60);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.getContentPane().setBackground(Color.red);
            }
        });

        b2 = new JButton("BLUE");
        b2.setBounds(150, 100, 100, 60);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.getContentPane().setBackground(Color.blue);
            }
        });

        panel.add(b1);
        panel.add(b2);

    }

    public static void main(String[] args) {
        new BgChangerSwing();
    }
}
