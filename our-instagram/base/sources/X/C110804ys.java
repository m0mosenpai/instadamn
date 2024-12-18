package X;

import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* renamed from: X.4ys, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110804ys extends C110814yt {
    public float A00;
    public int A01;

    @Override // X.C110814yt
    public final float A06(DisplayMetrics displayMetrics) {
        float f;
        float applyDimension;
        C14360o3.A0B(displayMetrics, 0);
        float f2 = this.A00;
        if (f2 <= 0.0f) {
            applyDimension = displayMetrics.densityDpi;
            f = 25.0f;
        } else {
            f = 1.0f;
            RectF rectF = AbstractC13880nE.A01;
            applyDimension = TypedValue.applyDimension(1, f2, displayMetrics);
        }
        return f / applyDimension;
    }

    @Override // X.C110814yt
    public final int A08() {
        return -1;
    }

    @Override // X.C110814yt
    public final int A0B(int i, int i2, int i3, int i4, int i5) {
        return (i3 - i) + this.A01;
    }
}
