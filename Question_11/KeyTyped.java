package Question_11;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyTyped extends Frame implements KeyListener {
    Label l, kt;
    TextField tf;

    public KeyTyped() {
        setTitle("Key Typed");
        setSize(300, 300);
        setVisible(true);
        setLayout(null);

        l = new Label("Type Something :");
        l.setBounds(30, 70, 100, 40);

        tf = new TextField();
        tf.setBounds(140, 80, 100, 20);
        tf.addKeyListener(this);

        kt = new Label();
        kt.setBounds(30, 120, 200, 40);

        add(l);
        add(kt);
        add(tf);

    }

    public void keyTyped(KeyEvent e) {
        kt.setText("" + e.getKeyChar());
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        new KeyTyped();
    }
}