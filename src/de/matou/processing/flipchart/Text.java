package de.matou.processing.flipchart;

public class Text extends FlipChartObject{

    protected String text = "";

    public Text(Object data, int x, int y, int color) {
        super(x,y,0,0,false,0,true,color);
        this.text = data.toString();
        this.stroke = true;
        this.fill = false;
    }

    @Override
    void draw(FlipChart board) {
        super.draw(board);

        board.text(text, posX, posY);
    }

    
}

