package de.matou.processing.whiteboard;

import processing.core.*;

class Whiteboard extends PApplet {

    /** The size of the applet. */
    private int[] size = {800, 600};

    Whiteboard() {
        // don't need to initialize anything here
    }

    Whiteboard(int xSize, int ySize) {
        this.size[0] = xSize;
        this.size[1] = ySize;
    }

    @Override
    public void setup() {
        // TODO set size somewhere else
        size(size[0],size[1]);

        //size(800,600, P3D);

        // default color white
        background(255);

        noLoop();
    }

    @Override
    public void draw() {
        // for WhiteboardObject in currentSlide
    
    }

}

