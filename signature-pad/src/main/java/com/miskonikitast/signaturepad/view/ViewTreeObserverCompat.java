package com.miskonikitast.signaturepad.view;

import android.view.ViewTreeObserver;

public class ViewTreeObserverCompat {
    /**
     * Remove a previously installed global layout callback.
     *
     * @param observer the view observer
     * @param victim   the victim
     */
    public static void removeOnGlobalLayoutListener(ViewTreeObserver observer, ViewTreeObserver.OnGlobalLayoutListener victim) {
        observer.removeOnGlobalLayoutListener(victim);
    }
}
