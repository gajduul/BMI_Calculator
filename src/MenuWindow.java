import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

public class MenuWindow extends JFrame implements ActionListener {
    JButton getBmiButton;
    JTextField weightField,heightField;
    public MenuWindow() {
        setSize(400, 300);
        setTitle("BMI Calculator");
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(105,155,255));

        JLabel appNameLabel = new JLabel("BMI CALCULATOR");
        appNameLabel.setBounds(60, 15, 300, 30);
        Font font = new Font("Arial", Font.BOLD, 30);
        appNameLabel.setFont(font);
        add(appNameLabel);

        JLabel bodyWeightLabel = new JLabel("Enter your body weight (kg):");
        bodyWeightLabel.setBounds(65, 65, 300, 30);
        add(bodyWeightLabel);

        weightField = newJTextField(225,65,100,30);


        JLabel bodyHeightLabel = new JLabel("Enter your height (cm):");
        bodyHeightLabel.setBounds(65, 115, 300, 30);
        add(bodyHeightLabel);

        heightField = newJTextField(225,115,100,30);

        getBmiButton = new JButton("Calculate BMI");
        getBmiButton.setBounds(110, 165, 150, 50);
        getBmiButton.setBackground(Color.white);
        add(getBmiButton);
        getBmiButton.addActionListener(this);

    }

    public JTextField newJTextField(int x, int y,int width, int height){

        JTextField textField = new JTextField();
        textField.setBounds(x, y, width, height);
        add(textField);
        return  textField;
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
