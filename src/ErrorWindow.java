import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ErrorWindow extends JFrame implements ActionListener {
    JButton exitButton;
    public ErrorWindow(){
        setSize(250, 150);
        setTitle("ERROR");
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(105,155,255));

        JLabel errorLabel = new JLabel("Invalid value! Try again!");
        errorLabel.setBounds(30, 10, 300, 30);
        errorLabel.setFont(new Font("Arial",Font.BOLD,15));
        add(errorLabel);

        exitButton = new JButton("Try again!");
        exitButton.setBounds(40, 50, 150, 50);
        exitButton.setBackground(Color.white);
        add(exitButton);
        exitButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if(source.equals(exitButton)){
            this.dispose();
        }
    }
}
