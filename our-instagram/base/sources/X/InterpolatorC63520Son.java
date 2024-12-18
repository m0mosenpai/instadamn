package X;

import android.view.animation.Interpolator;

/* renamed from: X.Son, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class InterpolatorC63520Son implements Interpolator {
    public final float A00;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) (1.0d + (Math.pow(2.0d, (-10.0f) * f) * Math.sin((((f - (r8 / 4.0f)) * 3.141592653589793d) * 2.0d) / this.A00)));
    }

    public InterpolatorC63520Son(float f) {
        this.A00 = f;
    }

    public InterpolatorC63520Son() {
        this(0.5f);
    }
}
