package X;

import android.window.BackEvent;

/* renamed from: X.000, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass000 {
    public static final float A00(BackEvent backEvent) {
        return backEvent.getProgress();
    }

    public static final float A01(BackEvent backEvent) {
        return backEvent.getTouchX();
    }

    public static final float A02(BackEvent backEvent) {
        return backEvent.getTouchY();
    }

    public static final int A03(BackEvent backEvent) {
        return backEvent.getSwipeEdge();
    }
}
