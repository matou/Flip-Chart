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

import java.util.LinkedList;
import java.util.List;

public abstract class FlipChartPresentation {

    private List<PresentationStateChangedListener> listeners = 
        new LinkedList<PresentationStateChangedListener>();

    /**
     * Allows to add a listener that will be notified when the presentation
     * changes it's state somehow. For example, when another sheet should be
     * displayed or the camera is to be moved.
     *
     * @param pscl the PresentationStateChangedListener to add
     */
    public final void addPresentationStateChangedListener(
            PresentationStateChangedListener pscl) {
        listeners.add(pscl);
    }

    /**
     * Call this when something changed at the presentation that needs to be
     * displayed.
     */
    protected final void stateChanged() {
        for (PresentationStateChangedListener pscl : listeners) 
            pscl.presentationStateChanged(this);
    }

    /**
     * Returns true if another sheet is to be displayed. This is to be resetted
     * when the sheet has been retrieved through calling getNextSheet().
     *
     * @return true if another sheet is to be displayed
     */
    abstract public boolean hasNextSheet();

    /**
     * Returns the current flip chart sheet. If it is called the first time for
     * a new sheet, hasNextSheet() is to be resetted.
     */
    abstract public FlipChartSheet getNextSheet();

}

