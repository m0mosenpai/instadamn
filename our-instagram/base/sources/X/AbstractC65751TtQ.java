package X;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: X.TtQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65751TtQ {
    public static final float A00(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC65754TtT.A00(edgeEffect);
        }
        return 0.0f;
    }

    public static final float A01(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC65754TtT.A01(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public static final EdgeEffect A02(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC65754TtT.A02(context);
        }
        return new C65756TtV(context);
    }

    public static final void A03(EdgeEffect edgeEffect, float f) {
        if (edgeEffect instanceof C65756TtV) {
            C65756TtV c65756TtV = (C65756TtV) edgeEffect;
            float f2 = c65756TtV.A00 + f;
            c65756TtV.A00 = f2;
            if (Math.abs(f2) > c65756TtV.A01) {
                c65756TtV.onRelease();
                return;
            }
            return;
        }
        edgeEffect.onRelease();
    }

    public static final void A04(EdgeEffect edgeEffect, int i) {
        if (Build.VERSION.SDK_INT >= 31 || edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }
}
