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

package de.matou.processing.flipchart.example;

import de.matou.processing.flipchart.FlipChartPresentation;
import de.matou.processing.flipchart.FlipChartPresenter;
import de.matou.processing.flipchart.FlipChartSheet;
import de.matou.processing.flipchart.Rectangle;
import de.matou.processing.flipchart.Text;

public class ExamplePresentation extends FlipChartPresentation {

    private FlipChartSheet current = null;
    private boolean hasNext = false;

    void start() {

        new FlipChartPresenter().startPresentation(this);

        current = new FlipChartSheet();
        current.addObject(new Text("hello", 50, 50, 0));
        current.addObject(new Rectangle(100, 100, 50, 50, 120));
        hasNext = true;
        stateChanged();

        System.out.println("pausing");

        try {Thread.sleep(3000); } catch (Exception e) {}

        current.addObject(new Text("world", 50, 70, 0));
        hasNext = true;
        stateChanged();


    }

    @Override
    public FlipChartSheet getNextSheet() {
        hasNext = false;
        return current;
    }

    @Override
    public boolean hasNextSheet() {
        return hasNext;
    }

    public static void main(String[] args) {
        new ExamplePresentation().start();
    }

}

