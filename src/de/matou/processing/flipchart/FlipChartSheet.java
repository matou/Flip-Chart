package de.matou.processing.flipchart;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * A flip chart sheet is unlimited in it's size and flip chart objects can be
 * drawn upon it.
 *
 * @author Matthias Matousek
 */
public class FlipChartSheet {

    private List<FlipChartObject> objects = new LinkedList<FlipChartObject>();

    private int color = 255;

    public FlipChartSheet() {}

    public FlipChartSheet(int color) {
        this.color = color;
    }

    public FlipChartSheet(Collection<? extends FlipChartObject> objs) {
        this.objects.addAll(objs);
    }

    public FlipChartSheet(int color, Collection<? extends FlipChartObject> objs) {
        this.color = color;
        this.objects.addAll(objs);
    }

    public void addObject(FlipChartObject obj) {
        this.objects.add(obj);
    }

    public void addObject(int index, FlipChartObject obj) {
        this.objects.add(index, obj);
    }

    List<FlipChartObject> getObjects() {
        return this.objects;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return this.color;
    }

}

