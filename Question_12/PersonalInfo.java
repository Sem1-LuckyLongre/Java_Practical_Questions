package Question_12;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonalInfo extends Frame implements ActionListener {

    Button b1, b2;
    Label name, course, rollno, college;

    public PersonalInfo() {

        setTitle("Personal Info");
        setVisible(true);
        setLayout(null);
        setSize(400, 400);

        b1 = new Button("A");
        b1.setBounds(50, 100, 80, 30);
        b1.addActionListener(this);

        b2 = new Button("B");
        b2.setBounds(150, 100, 80, 30);
        b2.addActionListener(this);

        Panel infoPanel = new Panel();
        infoPanel.setBounds(50, 150, 200, 200);
        infoPanel.setLayout(null);

        name = new Label("Click the button");
        name.setBounds(20, 20, 160, 30);

        course = new Label();
        course.setBounds(20, 50, 160, 30);

        rollno = new Label();
        rollno.setBounds(20, 80, 160, 30);

        college = new Label();
        college.setBounds(20, 110, 160, 30);

        add(b1);
        add(b2);
        add(infoPanel);

        infoPanel.add(name);
        infoPanel.add(course);
        infoPanel.add(rollno);
        infoPanel.add(college);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            name.setText("Name: Lucky Longre");
            course.setText("Course: B.Voc Software Development");
            rollno.setText("Roll No.: 24107037");
            college.setText("College: Ramanujan College, Du");
        } else {
            name.setText("SGPA of Semester 1: 8.64");
            course.setText("");
            rollno.setText("");
            college.setText("");
        }
    }

    public static void main(String[] args) {
        new PersonalInfo();
    }
}