import javax.swing.*;
import java.awt.*;

public class GuiOperation extends JFrame{
    public void newWindow(int width, int height,String name){
        setSize(width,height);
        setTitle(name);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(105,155,255));
    }

    public JTextField newJTextField(int x, int y,int width, int height){
        JTextField textField = new JTextField();
        textField.setBounds(x, y, width, height);
        add(textField);
        return  textField;
    }

    public JLabel newJLabel(String name,int x,int y,int width,int height){
        JLabel jLabel = new JLabel(name);
        jLabel.setBounds(x,y,width,height);
        add(jLabel);
        return jLabel;
    }

    public JButton newJButton(String name,int x,int y, int width, int height){
        JButton jButton = new JButton(name);
        jButton.setBounds(x,y,width,height);
        jButton.setBackground(Color.white);
        add(jButton);
        return jButton;
    }
}
