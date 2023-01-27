import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResultWindow extends JFrame implements ActionListener {
    JButton exitButton;
    public ResultWindow(int weight, int height){
        setSize(300, 300);
        setTitle("BMI CALCULATOR");
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(105,155,255));

        JLabel appNameLabel = new JLabel("RESULT");
        appNameLabel.setBounds(85, 15, 300, 30);
        Font font = new Font("Arial", Font.BOLD, 30);
        appNameLabel.setFont(font);
        add(appNameLabel);

        JLabel resultLabel = new JLabel("Your BMI is:");
        resultLabel.setBounds(80, 65, 300, 30);
        resultLabel.setFont(new Font("Arial",Font.BOLD,15));
        add(resultLabel);

        double result = Calculating.bmiCalculator(weight,height);
        JLabel bmiLabel = new JLabel(String.valueOf(result));
        bmiLabel.setBounds(180, 65, 300, 30);
        bmiLabel.setFont(new Font("Arial",Font.BOLD,15));
        add(bmiLabel);

        JLabel commentLabel = new JLabel(Calculating.comment(result));
        commentLabel.setBounds(75, 105, 300, 30);
        commentLabel.setFont(new Font("Arial",Font.BOLD,15));
        add(commentLabel);


        exitButton = new JButton("Close window");
        exitButton.setBounds(75, 145, 150, 50);
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
