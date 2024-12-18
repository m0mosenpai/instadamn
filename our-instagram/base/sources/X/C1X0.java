package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: X.1X0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1X0 extends AbstractC27881Wq {
    public static final InterfaceC27851Wn A00 = new Object();

    @Override // X.AbstractC27881Wq
    public final void A00(Matrix matrix, Rect rect, float f, float f2, float f3, float f4, int i, int i2) {
        float f5;
        float max;
        if (f4 > f3) {
            float f6 = i * f4;
            f5 = rect.left + Math.max(Math.min((rect.width() * 0.5f) - (f * f6), 0.0f), rect.width() - f6);
            max = rect.top;
            f3 = f4;
        } else {
            f5 = rect.left;
            float f7 = i2 * f3;
            max = Math.max(Math.min((rect.height() * 0.5f) - (f2 * f7), 0.0f), rect.height() - f7) + rect.top;
        }
        matrix.setScale(f3, f3);
        matrix.postTranslate((int) (f5 + 0.5f), (int) (max + 0.5f));
    }

    public final String toString() {
        return "focus_crop";
    }
}
