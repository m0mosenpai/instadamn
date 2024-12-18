package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.LQg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnTouchListenerC48081LQg implements View.OnTouchListener {
    public static final ViewOnTouchListenerC48081LQg A00 = new ViewOnTouchListenerC48081LQg();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view != null && motionEvent.getAction() == 2) {
            AbstractC13880nE.A0O(view);
            return false;
        }
        return false;
    }
}
