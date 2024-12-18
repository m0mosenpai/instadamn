package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: X.1Wx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C27931Wx extends AbstractC27881Wq {
    public static final InterfaceC27851Wn A00 = new Object();

    public final String toString() {
        return "center";
    }

    @Override // X.AbstractC27881Wq
    public final void A00(Matrix matrix, Rect rect, float f, float f2, float f3, float f4, int i, int i2) {
        matrix.setTranslate((int) (rect.left + ((rect.width() - i) * 0.5f) + 0.5f), (int) (rect.top + ((rect.height() - i2) * 0.5f) + 0.5f));
    }
}
