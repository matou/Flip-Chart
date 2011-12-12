package de.matou.processing.flipchart;

import java.awt.*;
import java.awt.event.*;

public class FlipChartPresenter extends Frame {

    private FlipChart flipchart;

    public FlipChartPresenter() {
        super("flip chart");
        setSize(800,600);

        setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        flipchart = new FlipChart();
        flipchart.init();
        add(flipchart);

        setResizable(false);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        this.setVisible(true);
    }

    /**
     * Starts the given presentation.
     * @param pres the presentation to start
     */
    public void startPresentation(FlipChartPresentation pres) {
        pres.addPresentationStateChangedListener(new PresentationStateChangedListener() {
            public void presentationStateChanged(FlipChartPresentation pres) {
                if (pres.hasNextSheet()) 
                    flipchart.putSheet(pres.getNextSheet());
            }
        });
    }

}

