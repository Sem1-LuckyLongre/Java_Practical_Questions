import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PersonalInfoSwing extends JFrame {

    public PersonalInfoSwing() {
        setTitle("Personal Info using Swing");
        setVisible(true);
        setLayout(null);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel infoPanel = new JPanel();
        infoPanel.setBounds(50, 150, 400, 400);
        infoPanel.setLayout(null);

        JLabel name = new JLabel("Click the button");
        name.setBounds(20, 20, 250, 30);

        JLabel course = new JLabel();
        course.setBounds(20, 50, 250, 30);

        JLabel rollno = new JLabel();
        rollno.setBounds(20, 80, 250, 30);

        JLabel college = new JLabel();
        college.setBounds(20, 110, 250, 30);

        add(infoPanel);

        infoPanel.add(name);
        infoPanel.add(course);
        infoPanel.add(rollno);
        infoPanel.add(college);

        JButton b1 = new JButton("A");
        b1.setBounds(80, 100, 80, 30);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                name.setText("Name: Lucky Longre");
                course.setText("Course: B.Voc Software Development");
                rollno.setText("Roll No.: 24107037");
                college.setText("College: Ramanujan College, Du");
            }
        });

        JButton b2 = new JButton("B");
        b2.setBounds(180, 100, 80, 30);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                name.setText("SGPA of Semester 1: 8.64");
                course.setText("");
                rollno.setText("");
                college.setText("");
            }
        });

        add(b1);
        add(b2);

    }

    public static void main(String[] args) {
        new PersonalInfoSwing();
    }
}