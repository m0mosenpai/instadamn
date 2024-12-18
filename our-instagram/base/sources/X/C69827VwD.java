package X;

import android.view.View;

/* renamed from: X.VwD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69827VwD {
    public static final void A00(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != 0 && mode2 != 0) {
        } else {
            throw new IllegalStateException("A catalyst view must have an explicit width and height given to it. This should normally happen as part of the standard catalyst UI framework.");
        }
    }
}
