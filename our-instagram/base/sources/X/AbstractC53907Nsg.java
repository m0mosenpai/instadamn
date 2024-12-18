package X;

import android.graphics.RectF;

/* renamed from: X.Nsg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53907Nsg {
    public static final RectF A00(float f, float f2, float f3, float f4) {
        RectF rectF = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
        float f5 = f / f2;
        float f6 = f3 / f4;
        if (f5 < f6) {
            float f7 = ((f3 - (f4 * f5)) / f3) / 2.0f;
            rectF.left += f7;
            rectF.right -= f7;
        } else if (f5 > f6) {
            float f8 = ((f4 - (f3 / f5)) / f4) / 2.0f;
            rectF.top += f8;
            rectF.bottom -= f8;
            return rectF;
        }
        return rectF;
    }
}
