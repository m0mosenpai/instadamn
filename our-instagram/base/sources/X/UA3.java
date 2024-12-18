package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes11.dex */
public final class UA3 extends GestureDetector.SimpleOnGestureListener {
    public final C66351UBk A00;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C66351UBk c66351UBk = this.A00;
        if (c66351UBk.getContext() == null) {
            return false;
        }
        float translationY = c66351UBk.getTranslationY();
        if (f2 > 0.0f) {
            c66351UBk.A03((int) Math.abs(((c66351UBk.getHeight() - translationY) / f2) * 1000.0f));
        } else {
            c66351UBk.A04(null, (int) Math.abs((translationY / (-f2)) * 1000.0f));
        }
        c66351UBk.A08 = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C66351UBk c66351UBk = this.A00;
        if (c66351UBk.getTranslationY() <= 0.0f && f2 > 0.0f) {
            return false;
        }
        c66351UBk.A08 = false;
        return true;
    }

    public UA3(C66351UBk c66351UBk) {
        this.A00 = c66351UBk;
    }
}
