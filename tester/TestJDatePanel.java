
package org.jdatepicker;

import javax.swing.*;

public class TestJDatePanel {

    public static void main(String[] args) {
        JFrame testFrame = new JFrame();
        DatePanel panel = new JDatePanel();
        testFrame.getContentPane().add((JComponent) panel);
    

        testFrame.setSize(300, 300);
        testFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        testFrame.setVisible(true);
    }

}