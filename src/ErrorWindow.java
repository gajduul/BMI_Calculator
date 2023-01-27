import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ErrorWindow extends GuiOperation implements ActionListener {
    JButton exitButton;
    public ErrorWindow(){
        newWindow(250,150,"ERROR");

        JLabel errorLabel = newJLabel("Invalid value! Try again!",30,10,300,30);
        errorLabel.setFont(new Font("Arial",Font.BOLD,15));

        exitButton = newJButton("Try again!",40,50,150,50);
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
