package X;

import android.util.DisplayMetrics;
import android.util.TypedValue;

/* loaded from: classes11.dex */
public final class WF1 {
    public static float A03(int i, float f) {
        if (i != 0) {
            return A02(f, Float.NaN);
        }
        return A01(f);
    }

    public static final float A00(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        return f / C63356SiD.A00().density;
    }

    public static final float A01(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        return TypedValue.applyDimension(1, f, C63356SiD.A00());
    }

    public static final float A02(float f, float f2) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        DisplayMetrics A00 = C63356SiD.A00();
        float applyDimension = TypedValue.applyDimension(2, f, A00);
        if (f2 >= 1.0f) {
            return Math.min(applyDimension, f * A00.density * f2);
        }
        return applyDimension;
    }
}
