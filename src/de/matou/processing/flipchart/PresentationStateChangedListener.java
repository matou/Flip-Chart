package de.matou.processing.flipchart;

public interface PresentationStateChangedListener {
   
    /**
     * This is to be called by the presentation when something has changed. Like
     * for example the current flip chart sheet.
     */ 
    public void presentationStateChanged(FlipChartPresentation pres);

}

