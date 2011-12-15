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

import processing.core.*;

class FlipChart extends PApplet {

    /** The size of the applet. */
    private int[] size = {800, 600};

    private FlipChartSheet currentSheet = null;

    FlipChart() {
        // don't need to initialize anything here
    }

    FlipChart(int xSize, int ySize) {
        this.size[0] = xSize;
        this.size[1] = ySize;
    }

    @Override
    public void setup() {
        // TODO this fucks up text
        //size(size[0],size[1],P3D);
        size(size[0],size[1]);

        //smooth();


        // default color white
        background(255);
    }

    @Override
    public void draw() {
        background(255); // default color
        if (currentSheet == null) return;

        background(currentSheet.getColor());

        for (FlipChartObject obj : currentSheet.getObjects()) {
            obj.draw(this);
        }
        
    }

    /**
     * The given sheet is to be displayed on the flip chart.
     * @param sheet the sheet to display
     */
    public void putSheet(FlipChartSheet sheet) {
        this.currentSheet = sheet;
    }

}

