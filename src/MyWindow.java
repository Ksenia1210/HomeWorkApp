import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame{
    public MyWindow(){
        setLocation(650,250);
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton myFirstButton = new JButton("Выход");
       // add(myFirstButton, BorderLayout.SOUTH);
        ActionListener myButtonListener = new CloseActionListener();

        myFirstButton.addActionListener(myButtonListener);
        JButton mySecondButton = new JButton("Вторая кнопка");
       // add(mySecondButton, BorderLayout.NORTH);

        JPanel myPanel = new JPanel(new GridLayout(1,2));
        myPanel.add(myFirstButton);
        myPanel.add(mySecondButton);
        add(myPanel, BorderLayout.SOUTH);


        setVisible(true);
    }
}
