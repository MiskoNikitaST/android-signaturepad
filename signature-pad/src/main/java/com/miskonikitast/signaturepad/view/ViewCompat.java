package com.miskonikitast.signaturepad.view;

import android.view.View;

public class ViewCompat {
    /**
     * Returns true if {@code view} has been through at least one layout since it
     * was last attached to or detached from a window.
     * <p>
     * See <a href="http://developer.android.com/reference/android/support/v4/view/ViewCompat.html#isLaidOut%28android.view.View%29">isLaidOut(View view)</a>
     *
     * @param view the view
     * @return true if this view has been through at least one layout since it was last attached to or detached from a window.
     */
    public static boolean isLaidOut(View view) {
        return view.isLaidOut();
    }
}
