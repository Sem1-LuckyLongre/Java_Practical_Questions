import java.awt.*;

public class PinkFrame extends Frame {
    public PinkFrame() {
        super("Pink Backgound");
        setSize(300, 300);
        Label txt = new Label("Pink Background");
        txt.setBounds(20, 20, 100, 50);
        add(txt);
        setBackground(Color.pink);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PinkFrame();
    }
}
