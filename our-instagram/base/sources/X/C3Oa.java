package X;

import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: X.3Oa, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Oa {
    public static final C3Oa A05 = new C3Oa(new PathInterpolator(1.0f, 0.25f, 1.0f, 0.25f), 8000.0f, 1000.0f, 30, 2000);
    public static final C3Oa A06 = new C3Oa(new PathInterpolator(1.0f, 1.0f, 1.0f, 1.0f), 1200.0f, 2000.0f, 1, 4000);
    public final float A00;
    public final float A01;
    public final int A02;
    public final long A03;
    public final Interpolator A04;

    public C3Oa(Interpolator interpolator, float f, float f2, int i, long j) {
        this.A03 = j;
        this.A02 = i;
        this.A01 = f;
        this.A00 = f2;
        this.A04 = interpolator;
    }
}
