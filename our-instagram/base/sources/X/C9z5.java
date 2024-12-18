package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;

/* renamed from: X.9z5, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9z5 {
    public static final Bitmap A00(Bitmap bitmap, String str, float f, float f2, float f3, boolean z) {
        float f4;
        float f5;
        Bitmap bitmap2 = bitmap;
        C14360o3.A0B(str, 1);
        if (bitmap2 == null && (bitmap2 = BitmapFactory.decodeFile(str, new BitmapFactory.Options())) == null) {
            return null;
        }
        Matrix A0Q = AbstractC166987dD.A0Q();
        A0Q.postRotate(f3);
        float f6 = -1.0f;
        if (!AbstractC167007dF.A1N((f3 > 90.0f ? 1 : (f3 == 90.0f ? 0 : -1))) && f3 != 270.0f) {
            float width = f / bitmap2.getWidth();
            if (!z) {
                f6 = 1.0f;
            }
            f5 = f6 * width;
            f4 = f2 / bitmap2.getHeight();
        } else {
            float width2 = f2 / bitmap2.getWidth();
            float height = f / bitmap2.getHeight();
            if (!z) {
                f6 = 1.0f;
            }
            f4 = height * f6;
            f5 = width2;
        }
        A0Q.preScale(f5, f4);
        int width3 = bitmap2.getWidth();
        int height2 = bitmap2.getHeight();
        C0fK.A03(bitmap2);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, width3, height2, A0Q, true);
        C14360o3.A07(createBitmap);
        if (bitmap2.equals(createBitmap)) {
            return createBitmap;
        }
        bitmap2.recycle();
        return createBitmap;
    }
}
