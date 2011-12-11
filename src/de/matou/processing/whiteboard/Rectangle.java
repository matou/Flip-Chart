package de.matou.processing.whiteboard;

public class Rectangle extends WhiteboardObject {

    /**
     * Constructs a filled rectangle with the given parameters.
     */
    public Rectangle(int x, int y, int width, int height, int fillColor) {
        this(x,y,width,height,false,0,true,fillColor);
    }

    public Rectangle(int x, int y, 
            int width, int height, 
            boolean stroke, int strokeColor, 
            boolean fill, int fillColor) {

        super(x,y,width,height,stroke,strokeColor,fill,fillColor);
    }

    @Override
    void draw(Whiteboard board) {
        super.draw(board);

        board.rect(posX, posY, this.width, this.height);
    } 

}

