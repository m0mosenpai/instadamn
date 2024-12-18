package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: X.1Wt, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Wt extends AbstractC27881Wq {
    public static final InterfaceC27851Wn A00 = new Object();

    public final String toString() {
        return "fit_y";
    }

    @Override // X.AbstractC27881Wq
    public final void A00(Matrix matrix, Rect rect, float f, float f2, float f3, float f4, int i, int i2) {
        float width = rect.left + ((rect.width() - (i * f4)) * 0.5f);
        float f5 = rect.top;
        matrix.setScale(f4, f4);
        matrix.postTranslate((int) (width + 0.5f), (int) (f5 + 0.5f));
    }
}
