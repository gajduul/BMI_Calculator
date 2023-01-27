import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

public class MenuWindow extends GuiOperation implements ActionListener {
    JButton getBmiButton;
    JTextField weightField,heightField;
    public MenuWindow() {

        newWindow(400,300,"BMI Calculator");

        JLabel appNameLabel = newJLabel("BMI CALCULATOR",60,15,300,30);
        appNameLabel.setFont(new Font("Arial", Font.BOLD, 30));

        newJLabel("Enter your body weight (kg):",65,65,300,30);

        weightField = newJTextField(225,65,100,30);

        newJLabel("Enter your height (cm):",65,115,300,30);

        heightField = newJTextField(225,115,100,30);

        getBmiButton = newJButton("Calculate BMI",110,165,150,50);
        getBmiButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source.equals(getBmiButton)) {
            try {
                int weight = Integer.parseInt(weightField.getText());
                int height = Integer.parseInt(heightField.getText());

                if( weight < 1 || height < 1)
                    new ErrorWindow();
                else
                    new ResultWindow(weight,height);
            }
            catch (NumberFormatException ime){
                new ErrorWindow();
            }
        }
    }
}
