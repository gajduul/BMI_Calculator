import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResultWindow extends GuiOperation implements ActionListener {
    JButton exitButton;
    public ResultWindow(int weight, int height){

        newWindow(300,300,"BMI CALCULATOR");

        JLabel appNameLabel = newJLabel("RESULT",85,15,300,30);
        appNameLabel.setFont( new Font("Arial", Font.BOLD, 30));

        JLabel resultLabel = newJLabel("Your BMI is:",80,65,300,30);
        resultLabel.setFont(new Font("Arial",Font.BOLD,15));

        double result = Calculating.bmiCalculator(weight,height);

        JLabel bmiLabel =  newJLabel(String.valueOf(result),180,65,300,30);
        bmiLabel.setFont(new Font("Arial",Font.BOLD,15));

        JLabel commentLabel = newJLabel(Calculating.comment(result),75,105,300,30);
        commentLabel.setFont(new Font("Arial",Font.BOLD,15));

        exitButton = newJButton("Close window",75,145,150,50);
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
