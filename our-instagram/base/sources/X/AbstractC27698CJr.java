package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.SparseArray;

/* renamed from: X.CJr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27698CJr {
    public static final Bitmap A00(SparseArray sparseArray, float f, int i) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        C14360o3.A07(createBitmap);
        Canvas canvas = new Canvas(createBitmap);
        int size = sparseArray.size();
        if (size != 0 && size != 1) {
            if (size != 2) {
                if (size == 3) {
                    Bitmap bitmap = (Bitmap) sparseArray.get(0);
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, 8.0f * f, 28.0f * f, (Paint) null);
                    }
                    Bitmap bitmap2 = (Bitmap) sparseArray.get(1);
                    if (bitmap2 != null) {
                        canvas.drawBitmap(bitmap2, 25.0f * f, 5.0f * f, (Paint) null);
                    }
                    Bitmap bitmap3 = (Bitmap) sparseArray.get(2);
                    if (bitmap3 != null) {
                        canvas.drawBitmap(bitmap3, 42.0f * f, f * 27.0f, (Paint) null);
                    }
                }
            } else {
                Bitmap bitmap4 = (Bitmap) sparseArray.get(0);
                if (bitmap4 != null) {
                    canvas.drawBitmap(bitmap4, 7.0f * f, 25.0f * f, (Paint) null);
                }
                Bitmap bitmap5 = (Bitmap) sparseArray.get(1);
                if (bitmap5 != null) {
                    canvas.drawBitmap(bitmap5, 32.0f * f, f * 7.0f, (Paint) null);
                    return createBitmap;
                }
            }
        } else {
            Bitmap bitmap6 = (Bitmap) sparseArray.get(0);
            if (bitmap6 != null) {
                canvas.drawBitmap(bitmap6, 0.0f, 0.0f, (Paint) null);
                return createBitmap;
            }
        }
        return createBitmap;
    }
}
