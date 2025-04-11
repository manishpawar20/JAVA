//Learning some GUI creating in java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Day17 extends JFrame implements ActionListener {

    private static JLabel success;
    private static JLabel userLabel;
    private static JButton b1;
    private static JPasswordField userPassword;
    private static JLabel passwordLabel;
    private static JTextField userText;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(500,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Login GUI");
        panel.setBackground(Color.lightGray);
        panel.setLayout(null);

        userLabel = new JLabel("Username");
        userLabel.setBounds(50,50,100,30);
        panel.add(userLabel);

        userText = new JTextField(50);
        userText.setBounds(130,50,100,30);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(50,100,100,30);
        panel.add(passwordLabel);

        userPassword = new JPasswordField(20);
        userPassword.setBounds(130,100,100,30);
        panel.add(userPassword);

        b1 = new JButton("Login");
        b1.setBounds(50,150,80,25);
        b1.addActionListener(new Day17());
        panel.add(b1);

        success = new JLabel("");
        success.setBounds(50,200,350,30);
        panel.add(success);

        frame.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = userPassword.getText();

        if(user.equals("Manish") && password.equals("Manish1234"))
        {
            success.setText("Login Successful!!");
            success.setFont(new Font("Arial", Font.BOLD, 15));
            success.setForeground(Color.GREEN);
            success.setPreferredSize(new Dimension(250, 30));
        }
        else {
            success.setText("Incorrect Password or Username!!");
            success.setFont(new Font("Arial", Font.BOLD, 15));
            success.setForeground(Color.RED);
        }
    }
}