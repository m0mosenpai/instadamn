package X;

import android.graphics.Matrix;
import android.widget.ImageView;

/* renamed from: X.JgK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44215JgK {
    public static void A00(ImageView imageView, float f, float f2, float f3, int i, int i2) {
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        Matrix A0Q = AbstractC166987dD.A0Q();
        float f4 = i;
        float A07 = AbstractC166987dD.A07(imageView) / f4;
        A0Q.setScale(A07, A07);
        A0Q.postTranslate(A07 * f4 * f * (-1.0f), i2 * A07 * f3 * (-1.0f));
        float f5 = 1.0f / (f2 - f);
        A0Q.postScale(f5, f5);
        imageView.setImageMatrix(A0Q);
    }
}
