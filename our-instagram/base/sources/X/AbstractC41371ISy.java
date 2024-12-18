package X;

import android.content.Context;

/* renamed from: X.ISy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41371ISy {
    public static final float A00(Context context, C37905Gm2 c37905Gm2, float f) {
        float f2;
        float f3;
        if (c37905Gm2 != null) {
            f2 = c37905Gm2.A05 / c37905Gm2.A07;
        } else {
            f2 = 0.5f;
        }
        float f4 = f2 - 0.5f;
        if (c37905Gm2 != null) {
            f3 = c37905Gm2.A07;
        } else {
            f3 = 0.0f;
        }
        float f5 = 0.5f * f3;
        float A04 = AbstractC13880nE.A04(context, 224);
        if (A04 < f5) {
            f5 = A04;
        }
        return (f4 * f3) - (f * f5);
    }

    public static final float A01(C37905Gm2 c37905Gm2) {
        float f;
        int i;
        if (c37905Gm2 != null) {
            f = c37905Gm2.A04 / c37905Gm2.A06;
        } else {
            f = 0.5f;
        }
        float f2 = f - 0.5f;
        if (c37905Gm2 != null) {
            i = c37905Gm2.A06;
        } else {
            i = 0;
        }
        return f2 * i;
    }
}
