package de.matou.processing.flipchart;

/**
 * A flip chart object is any object that can be drawn on a sheet of a flip
 * chart.
 *
 * @author Matthias Matousek
 */
abstract class FlipChartObject {

    // coordinates
    protected int posX = 0;
    protected int posY = 0;

    // the colors
    protected int strokeColor;
    protected int fillColor;

    protected boolean stroke = false;
    protected boolean fill = true;

    protected int width = 0;
    protected int height = 0;

    FlipChartObject() {}
    
    FlipChartObject(int x, int y,
            int width, int height,
            boolean stroke, int strokeColor,
            boolean fill, int fillColor) {
        this.posX = x;
        this.posY = y;
        this.width = width;
        this.height = height;
        this.stroke = stroke;
        this.strokeColor = strokeColor;
        this.fill = fill;
        this.fillColor = fillColor;
    }

    /**
     * Draws this flip chart object to the given flip chart at it's coordinates.
     *
     * @param board the flip chart to draw to
     */
    void draw(FlipChart board) {
       
        // does it have a stroke? if yes -> set the color 
        if (!stroke) board.noStroke();
        else board.stroke(strokeColor);

        // is it filled? if yes -> set the color
        if (fill) board.fill(fillColor);
        else board.noFill();

    }

}

