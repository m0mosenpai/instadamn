package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: X.AGi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23098AGi {
    public static final C23098AGi A02 = new Object();
    public static final RectF A00 = AbstractC166987dD.A0X();
    public static final RectF A01 = AbstractC166987dD.A0X();

    public final Bitmap A00(Bitmap.Config config, Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix A0Q = AbstractC166987dD.A0Q();
        RectF rectF = A00;
        RectF rectF2 = A01;
        rectF.set(0.0f, 0.0f, width, height);
        float f = 0.0f - 100000.0f;
        float f2 = 100000.0f + 224.0f;
        if (width * 224 > height * 224) {
            rectF2.set(f, 0.0f, f2, 224.0f);
        } else {
            rectF2.set(0.0f, f, 224.0f, f2);
        }
        A0Q.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        Bitmap createBitmap = Bitmap.createBitmap(224, 224, config);
        C14360o3.A07(createBitmap);
        new Canvas(createBitmap).drawBitmap(bitmap, A0Q, AbstractC166997dE.A0Q());
        return createBitmap;
    }
}
