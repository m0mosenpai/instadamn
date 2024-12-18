package X;

import android.graphics.RectF;
import android.opengl.Matrix;

/* renamed from: X.Xgw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72568Xgw {
    public static void A00(float[] fArr, int i, int i2, int i3, int i4) {
        float f;
        if (i != 0 && i2 != 0) {
            if (i3 != 0 && i4 != 0) {
                float f2 = i3;
                float f3 = i4;
                float f4 = f2 / f3;
                float f5 = i / i2;
                float f6 = 0.0f;
                if (f4 < f5) {
                    float f7 = f5 * 1.0f;
                    f6 = (((f7 - (f4 * 1.0f)) / 2.0f) / f7) * f2;
                    f = 0.0f;
                } else {
                    float f8 = 1.0f / f5;
                    f = (((f8 - (1.0f / f4)) / 2.0f) / f8) * f3;
                }
                RectF rectF = new RectF(f6, f, f2 - f6, f3 - f);
                RectF rectF2 = new RectF(rectF.left / f2, rectF.top / f3, rectF.right / f2, rectF.bottom / f3);
                Matrix.translateM(fArr, 0, rectF2.left, rectF2.top, 0.0f);
                Matrix.scaleM(fArr, 0, rectF2.width(), rectF2.height(), 1.0f);
                return;
            }
            throw AbstractC166987dD.A12("Output Widths and Heights cannot be 0 for calculating crop rect");
        }
        throw AbstractC166987dD.A12("Input Widths and Heights cannot be 0 for calculating crop rect");
    }
}
