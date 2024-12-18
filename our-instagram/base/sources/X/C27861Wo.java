package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: X.1Wo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C27861Wo extends AbstractC27881Wq {
    public static final InterfaceC27851Wn A00 = new Object();

    public final String toString() {
        return "fit_xy";
    }

    @Override // X.AbstractC27881Wq
    public final void A00(Matrix matrix, Rect rect, float f, float f2, float f3, float f4, int i, int i2) {
        float f5 = rect.left;
        float f6 = rect.top;
        matrix.setScale(f3, f4);
        matrix.postTranslate((int) (f5 + 0.5f), (int) (f6 + 0.5f));
    }
}
