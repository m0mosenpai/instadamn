package X;

import android.graphics.Bitmap;

/* renamed from: X.9vP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC224389vP {
    public static final Bitmap A00(Bitmap bitmap) {
        int i;
        int i2 = 224;
        if (bitmap.getWidth() < bitmap.getHeight()) {
            i = (bitmap.getHeight() * 224) / bitmap.getWidth();
        } else {
            i = 224;
            i2 = (bitmap.getWidth() * 224) / bitmap.getHeight();
        }
        Bitmap A00 = C0fK.A00(bitmap, i2, i, true);
        C14360o3.A07(A00);
        return A00;
    }
}
