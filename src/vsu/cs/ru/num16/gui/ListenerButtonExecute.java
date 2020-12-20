package vsu.cs.ru.num16.gui;

import vsu.cs.ru.num16.common.MaxLengthOfSubsequenceAndPositionOfFirstElement;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class ListenerButtonExecute implements ActionListener {
    private JTextField fieldArrayOfIntegers;
    private JTextField fieldMaxLength;
    private JTextField fieldPositionOfFirstElement;

    public ListenerButtonExecute(JTextField fieldArrayOfIntegers, JTextField fieldMaxLength, JTextField fieldPositionOfFirstElement) {
        this.fieldArrayOfIntegers = fieldArrayOfIntegers;
        this.fieldMaxLength = fieldMaxLength;
        this.fieldPositionOfFirstElement = fieldPositionOfFirstElement;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String array = fieldArrayOfIntegers.getText();
        int[] arrayOfIntegers = ArrayUtils.toIntArray(array);
        MaxLengthOfSubsequenceAndPositionOfFirstElement result = new MaxLengthOfSubsequenceAndPositionOfFirstElement(arrayOfIntegers);
        fieldPositionOfFirstElement.setText(String.valueOf(result.getPositionOfFirstElement()));
        fieldMaxLength.setText(Integer.toString(result.getMaxLength()));
    }
}
