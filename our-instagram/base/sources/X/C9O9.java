package X;

import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: X.9O9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9O9 {
    public final Matrix A00;

    public C9O9(Matrix matrix, int i, int i2, int i3, int i4) {
        RectF A0Y = AbstractC166987dD.A0Y(i3, i4);
        matrix.mapRect(A0Y);
        Matrix A0Q = AbstractC166987dD.A0Q();
        A0Q.setScale(i == 1 ? -1.0f : 1.0f, 1.0f);
        A0Q.postRotate(i2);
        Matrix A0Q2 = AbstractC166987dD.A0Q();
        A0Q2.setRectToRect(new RectF(-1000.0f, -1000.0f, 1000.0f, 1000.0f), A0Y, Matrix.ScaleToFit.FILL);
        A0Q.setConcat(A0Q2, A0Q);
        Matrix A0Q3 = AbstractC166987dD.A0Q();
        this.A00 = A0Q3;
        A0Q.invert(A0Q3);
    }
}
