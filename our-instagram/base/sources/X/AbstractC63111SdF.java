package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: X.SdF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63111SdF {
    public static final ThreadLocal A02 = new TYK();
    public static final ThreadLocal A00 = new TYL();
    public static final TYY A01 = new TYY();

    public static final void A01(Rect rect, int i, int i2, int i3, int i4) {
        C14360o3.A0B(rect, 0);
        if (i > i2) {
            i2 = i;
            i = i2;
        }
        if (i3 > i4) {
            i4 = i3;
            i3 = i4;
        }
        float f = i3;
        float f2 = i4;
        float f3 = i;
        float f4 = i2;
        if (f / f2 > f3 / f4) {
            int i5 = (i3 - ((int) (f3 * (f2 / f4)))) / 2;
            rect.set(i5, 0, i3 - i5, i4);
        } else {
            int i6 = (i4 - ((int) (f4 * (f / f3)))) / 2;
            rect.set(0, i6, i3, i4 - i6);
        }
    }

    public static final Matrix A00(int i, int i2, int i3, int i4) {
        Object obj = A02.get();
        C14360o3.A0A(obj);
        A01((Rect) obj, i, i2, i3, i4);
        float f = i;
        float f2 = i2;
        float max = Math.max(f / r6.width(), f2 / r6.height());
        Matrix matrix = A01.get();
        matrix.postTranslate(-r6.left, -r6.top);
        matrix.postScale(max, max);
        matrix.postScale(-1.0f, 1.0f, f / 2.0f, f2 / 2.0f);
        return matrix;
    }
}
