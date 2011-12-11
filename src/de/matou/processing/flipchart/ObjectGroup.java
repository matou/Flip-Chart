package de.matou.processing.flipchart;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ObjectGroup extends FlipChartObject {

    private List<FlipChartObject> objects = new LinkedList<FlipChartObject>();

    public ObjectGroup() {
    }

    public ObjectGroup(Collection<? extends FlipChartObject> objs) {
        this.objects.addAll(objs);
    }

    @Override
    void draw(FlipChart chart) {
        for (FlipChartObject obj : objects) {
            obj.draw(chart);
        }
    }

}

