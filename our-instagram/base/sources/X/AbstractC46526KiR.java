package X;

import android.view.MotionEvent;

/* renamed from: X.KiR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46526KiR {
    public static final boolean A00(MotionEvent motionEvent, int i) {
        float rawX = motionEvent.getRawX(i);
        if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
            float rawY = motionEvent.getRawY(i);
            if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
