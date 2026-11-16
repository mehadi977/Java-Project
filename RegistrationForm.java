import javax.swing.*;

public class RegistrationForm {

    public static void main(String[] args) {

        JFrame f = new JFrame("Registration Form");

        // Name
        JLabel l1 = new JLabel("Name:");
        l1.setBounds(30,30,100,25);
        JTextField t1 = new JTextField();
        t1.setBounds(140,30,180,25);

        // Semester
        JLabel l2 = new JLabel("Semester:");
        l2.setBounds(30,70,100,25);
        JTextField t2 = new JTextField();
        t2.setBounds(140,70,180,25);

        // Roll
        JLabel l3 = new JLabel("Roll:");
        l3.setBounds(30,110,100,25);
        JTextField t3 = new JTextField();
        t3.setBounds(140,110,180,25);

        // Shift
        JLabel l4 = new JLabel("Shift:");
        l4.setBounds(30,150,100,25);
        String shift[] = {"1st", "2nd"};
        JComboBox<String> cbShift = new JComboBox<>(shift);
        cbShift.setBounds(140,150,180,25);

        // Email
        JLabel l5 = new JLabel("Email:");
        l5.setBounds(30,190,100,25);
        JTextField t5 = new JTextField();
        t5.setBounds(140,190,180,25);

        // Password
        JLabel l6 = new JLabel("Password:");
        l6.setBounds(30,230,100,25);
        JPasswordField p = new JPasswordField();
        p.setBounds(140,230,180,25);

        // Gender
        JLabel l7 = new JLabel("Gender:");
        l7.setBounds(30,270,100,25);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(140,270,70,25);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(220,270,80,25);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        // Department
        JLabel l8 = new JLabel("Department:");
        l8.setBounds(30,310,100,25);

        String dept[] = {"CST","ET","RAC","Civil"};
        JComboBox<String> cb = new JComboBox<>(dept);
        cb.setBounds(140,310,180,25);

        // Buttons
        JButton submit = new JButton("Submit");
        submit.setBounds(70,370,100,30);

        JButton reset = new JButton("Reset");
        reset.setBounds(200,370,100,30);

        // Add Components
        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(l3); f.add(t3);
        f.add(l4); f.add(cbShift);
        f.add(l5); f.add(t5);
        f.add(l6); f.add(p);
        f.add(l7); f.add(male); f.add(female);
        f.add(l8); f.add(cb);
        f.add(submit); f.add(reset);

        // Frame Settings
        f.setSize(400,470);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}