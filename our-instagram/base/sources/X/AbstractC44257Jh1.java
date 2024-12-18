package X;

import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;

/* renamed from: X.Jh1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44257Jh1 {
    public static final void A00(DisplayMetrics displayMetrics, int[] iArr, int i, int i2, boolean z) {
        int i3 = displayMetrics.widthPixels;
        int i4 = 2;
        if (z) {
            i4 = 4;
        }
        RectF rectF = AbstractC13880nE.A01;
        int A01 = C1H4.A01(TypedValue.applyDimension(1, i4, displayMetrics));
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                i3 = size;
            }
        } else {
            i3 = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 1073741824) {
                A01 = size2;
            }
        } else {
            A01 = Math.min(A01, size2);
        }
        iArr[0] = i3;
        iArr[1] = A01;
    }
}
