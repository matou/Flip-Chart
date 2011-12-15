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
        size(size[0],size[1],P3D);

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

