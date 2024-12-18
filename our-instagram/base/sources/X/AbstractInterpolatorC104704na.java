package X;

import android.view.animation.Interpolator;

/* renamed from: X.4na, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractInterpolatorC104704na implements Interpolator {
    public final float A00 = 1.0f / 200.0f;
    public final float[] A01;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.A01;
        int min = Math.min((int) (200.0f * f), 199);
        float f2 = this.A00;
        float f3 = (f - (min * f2)) / f2;
        float f4 = fArr[min];
        return f4 + (f3 * (fArr[min + 1] - f4));
    }

    public AbstractInterpolatorC104704na(float[] fArr) {
        this.A01 = fArr;
    }
}
