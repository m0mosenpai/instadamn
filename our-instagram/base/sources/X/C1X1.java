package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: X.1X1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1X1 extends AbstractC27881Wq {
    public static final InterfaceC27851Wn A00 = new Object();

    public final String toString() {
        return "fit_bottom_start";
    }

    @Override // X.AbstractC27881Wq
    public final void A00(Matrix matrix, Rect rect, float f, float f2, float f3, float f4, int i, int i2) {
        float min = Math.min(f3, f4);
        float f5 = rect.left;
        float height = rect.top + (rect.height() - (i2 * min));
        matrix.setScale(min, min);
        matrix.postTranslate((int) (f5 + 0.5f), (int) (height + 0.5f));
    }
}