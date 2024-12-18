package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/* renamed from: X.5M5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5M5 {
    public static final C5M5 A00 = new Object();

    public static final boolean A00(Drawable drawable, Drawable drawable2) {
        Bitmap A0D;
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap2;
        Bitmap.Config config;
        BitmapDrawable bitmapDrawable2;
        Bitmap bitmap3;
        Bitmap.Config config2;
        if ((drawable instanceof BitmapDrawable) && (bitmap3 = (bitmapDrawable2 = (BitmapDrawable) drawable).getBitmap()) != null && (config2 = bitmap3.getConfig()) != null) {
            A0D = bitmapDrawable2.getBitmap().copy(config2, true);
        } else {
            A0D = C1NC.A0D(drawable);
        }
        C14360o3.A07(A0D);
        if (drawable2 != null) {
            if ((drawable2 instanceof BitmapDrawable) && (bitmap2 = (bitmapDrawable = (BitmapDrawable) drawable2).getBitmap()) != null && (config = bitmap2.getConfig()) != null) {
                bitmap = bitmapDrawable.getBitmap().copy(config, true);
            } else {
                bitmap = C1NC.A0D(drawable2);
            }
            C14360o3.A07(bitmap);
        } else {
            bitmap = null;
        }
        boolean z = false;
        if (bitmap != null && A0D.getWidth() == bitmap.getWidth() && A0D.getHeight() == bitmap.getHeight()) {
            z = Arrays.equals(A01(A0D), A01(bitmap));
            if (!A0D.isRecycled()) {
                A0D.recycle();
            }
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        return z;
    }

    public static final byte[] A01(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C0fK.A02(Bitmap.CompressFormat.JPEG, bitmap, byteArrayOutputStream, 100);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            C14360o3.A07(byteArray);
            return byteArray;
        } finally {
        }
    }
}
