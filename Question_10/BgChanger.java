package Question_10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BgChanger extends Frame implements ActionListener {
    Button b1, b2;

    public BgChanger() {
        setTitle("Background Changer");
        setSize(300, 300);
        setVisible(true);
        setLayout(null);

        b1 = new Button("RED");
        b1.setBounds(30, 100, 60, 60);
        b1.addActionListener(this);

        b2 = new Button("BLUE");
        b2.setBounds(150, 100, 60, 60);
        b2.addActionListener(this);

        add(b1);
        add(b2);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            setBackground(Color.RED);
        } else {
            setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        new BgChanger();
    }
}