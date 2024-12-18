package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes11.dex */
public final class UA2 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C69293Vl1 A00;

    public UA2(C69293Vl1 c69293Vl1) {
        this.A00 = c69293Vl1;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C69293Vl1 c69293Vl1 = this.A00;
        EK5 ek5 = c69293Vl1.A02;
        if (ek5 != null) {
            ek5.A00();
        }
        View view = c69293Vl1.A01;
        if (view != null) {
            AbstractC13880nE.A0O(view);
            return true;
        }
        return true;
    }
}
