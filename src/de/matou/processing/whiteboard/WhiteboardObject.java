package de.matou.processing.whiteboard;

abstract class WhiteboardObject {

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

    WhiteboardObject() {}
    
    WhiteboardObject(int x, int y,
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
     * Draws this whiteboard object to the given whiteboard at it's coordinates.
     *
     * @param board the whiteboard to draw to
     */
    void draw(Whiteboard board) {
       
        // does it have a stroke? if yes -> set the color 
        if (!stroke) board.noStroke();
        else board.stroke(strokeColor);

        // is it filled? if yes -> set the color
        if (fill) board.fill(fillColor);
        else board.noFill();

    }

}

