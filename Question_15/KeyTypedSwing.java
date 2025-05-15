import java.awt.event.*;
import javax.swing.*;

// Code Runner
public class KeyTypedSwing extends JFrame {

    public KeyTypedSwing() {
        setTitle("Key Typed using Swing");
        setSize(300, 300);

        JLabel l = new JLabel("Type Something: ");
        l.setBounds(30, 70, 105, 40);

        JLabel kt = new JLabel();
        kt.setBounds(30, 120, 200, 40);

        JTextField tf = new JTextField();
        tf.setBounds(140, 80, 100, 20);
        tf.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                kt.setText("" + e.getKeyChar());
            }

            public void keyPressed(KeyEvent e) {
            }

            public void keyReleased(KeyEvent e) {
            }
        });

        add(l);
        add(kt);
        add(tf);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new KeyTypedSwing();
    }
}