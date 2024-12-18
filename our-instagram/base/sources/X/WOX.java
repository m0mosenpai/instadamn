package X;

import android.view.animation.Interpolator;

/* loaded from: classes11.dex */
public final class WOX implements Interpolator {
    public float A00 = 1.0f;
    public float A01;
    public float A02;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f <= 0.5f) {
            float f2 = this.A02;
            return (f * f2) + ((f * (((this.A01 - f2) / 0.5f) * f)) / 2.0f);
        }
        float f3 = this.A02;
        float f4 = this.A01;
        float f5 = (0.5f * f3) + ((0.5f * (((f4 - f3) / 0.5f) * 0.5f)) / 2.0f);
        float f6 = f - 0.5f;
        float f7 = this.A00;
        float f8 = (f4 - f7) / 0.5f;
        float f9 = 0.5f - f6;
        return (f6 * f7) + ((((f8 * 0.5f) * 0.5f) / 2.0f) - ((f9 * (f8 * f9)) / 2.0f)) + f5;
    }
}
