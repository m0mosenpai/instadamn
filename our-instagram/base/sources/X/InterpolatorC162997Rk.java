package X;

import android.view.animation.Interpolator;

/* renamed from: X.7Rk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class InterpolatorC162997Rk implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) ((Math.sin((f + 1.5d) * 3.141592653589793d) + 1.0d) * 0.5d);
    }
}
