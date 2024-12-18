package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.AFk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23078AFk {
    public static final RectF A01 = AbstractC166987dD.A0X();
    public static final RectF A00 = AbstractC166987dD.A0X();

    public static final void A00(Drawable drawable, C210949Ur c210949Ur, C148276lx c148276lx, int i, int i2) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        RectF rectF = A01;
        rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        RectF rectF2 = A00;
        rectF2.set(0.0f, 0.0f, i, i2);
        Matrix matrix = c210949Ur.A01;
        matrix.reset();
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f = ((C148286ly) c148276lx.A0O.get(0)).A07;
        matrix.postScale(f, f, rectF2.centerX(), rectF2.centerY());
        c210949Ur.A03.setImageMatrix(matrix);
    }
}
