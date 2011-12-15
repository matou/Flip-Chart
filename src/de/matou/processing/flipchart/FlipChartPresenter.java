/*
 * Copyright (c) 2011 Matthias Matousek <m@tou.io>
 * 
 * Permission to use, copy, modify, and distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

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

