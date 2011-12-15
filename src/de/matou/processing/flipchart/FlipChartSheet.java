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

