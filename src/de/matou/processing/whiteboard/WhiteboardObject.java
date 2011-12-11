package de.matou.processing.whiteboard;

abstract class WhiteboardObject {

    // coordinates
    protected int posX = 0;
    protected int posY = 0;

    // the colors
    protected int colorRed = 0;
    protected int colorGreen = 0;
    protected int colorBlue = 0;

    /**
     * Draws this whiteboard object to the given whiteboard at it's coordinates
     * plus the given offset.
     *
     * @param board the whiteboard to draw to
     * @param xOffset the offset to add to posX
     * @param yOffset the offset to add to posY
     */
    abstract void draw(Whiteboard board, int xOffset, int yOffset);
    
}

