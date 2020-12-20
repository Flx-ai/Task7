package vsu.cs.ru.num16.gui;

import javax.swing.*;

public class FrameMain extends JFrame {
    private JPanel panelMain;
    private JButton buttonExecute;
    private JTextField fieldArrayOfIntegers;
    private JTextField fieldMaxLength;
    private JTextField fieldPositionOfFirstElement;

    public FrameMain() {
        setTitle("Program");
        setContentPane(panelMain);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,500,450,140);
        setResizable(true);

        buttonExecute.addActionListener(new ListenerButtonExecute(fieldArrayOfIntegers, fieldMaxLength, fieldPositionOfFirstElement));
    }
}
