package X;

import android.view.View;

/* renamed from: X.Kkr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46674Kkr {
    public static final int A00(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if ((mode != Integer.MIN_VALUE && mode != 1073741824) || size >= size2) {
            size = size2;
        }
        return View.MeasureSpec.makeMeasureSpec(size, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
    }
}
