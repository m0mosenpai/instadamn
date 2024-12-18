package X;

import android.os.Build;
import android.util.DisplayMetrics;

/* loaded from: classes11.dex */
public abstract class VKX {
    public static float A00(DisplayMetrics displayMetrics, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            return VKW.A00(displayMetrics, f);
        }
        float f2 = displayMetrics.scaledDensity;
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return f / f2;
    }
}
