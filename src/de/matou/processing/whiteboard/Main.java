package de.matou.processing.flipchart;

import java.applet.Applet;

import java.awt.*;
import java.awt.event.*;

public class Main extends Frame {

    public Main() {
        super("flip chart");
        setSize(800,600);

        setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        Applet flipchart = new FlipChart();
        flipchart.init();
        add(flipchart);

        setResizable(false);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }

}

