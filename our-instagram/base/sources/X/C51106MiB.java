package X;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: X.MiB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51106MiB extends C110814yt {
    public final int A00;

    @Override // X.C110814yt
    public final float A06(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    public C51106MiB(Context context, int i) {
        super(context);
        this.A00 = i;
    }

    @Override // X.C110814yt
    public final int A0B(int i, int i2, int i3, int i4, int i5) {
        return AbstractC50522MSa.A04(i4, i3, i2, i) + this.A00;
    }
}
