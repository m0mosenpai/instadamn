package X;

import android.content.Context;
import android.util.DisplayMetrics;

/* loaded from: classes8.dex */
public final class JnU extends C110814yt {
    public final float A00;
    public final int A01;

    @Override // X.C110814yt
    public final float A06(DisplayMetrics displayMetrics) {
        C14360o3.A0B(displayMetrics, 0);
        return this.A00 / displayMetrics.densityDpi;
    }

    @Override // X.C110814yt
    public final int A0B(int i, int i2, int i3, int i4, int i5) {
        return (i3 - i) + this.A01;
    }

    public JnU(Context context, float f, int i) {
        super(context);
        this.A00 = f;
        this.A01 = i;
    }
}
