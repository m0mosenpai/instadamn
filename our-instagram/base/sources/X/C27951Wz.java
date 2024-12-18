package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: X.1Wz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C27951Wz extends AbstractC27881Wq {
    public static final InterfaceC27851Wn A00 = new Object();

    public final String toString() {
        return "center_crop";
    }

    @Override // X.AbstractC27881Wq
    public final void A00(Matrix matrix, Rect rect, float f, float f2, float f3, float f4, int i, int i2) {
        float f5;
        float height;
        if (f4 > f3) {
            f5 = rect.left + ((rect.width() - (i * f4)) * 0.5f);
            height = rect.top;
            f3 = f4;
        } else {
            f5 = rect.left;
            height = ((rect.height() - (i2 * f3)) * 0.5f) + rect.top;
        }
        matrix.setScale(f3, f3);
        matrix.postTranslate((int) (f5 + 0.5f), (int) (height + 0.5f));
    }
}
