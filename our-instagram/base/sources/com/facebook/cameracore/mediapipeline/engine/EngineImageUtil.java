package com.facebook.cameracore.mediapipeline.engine;

import X.C0fL;
import X.C14360o3;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class EngineImageUtil {
    public static final EngineImageUtil INSTANCE = new Object();

    public static final boolean getBytesFromByteArray(byte[] bArr, int i, ByteBuffer byteBuffer, int i2) {
        C14360o3.A0B(byteBuffer, 2);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inSampleSize = i2;
        try {
            Bitmap A00 = C0fL.A00(bArr, 0, i, options);
            if (A00 != null) {
                A00.copyPixelsToBuffer(byteBuffer);
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static final int[] getDimensionFromByteArray(byte[] bArr, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        C0fL.A00(bArr, 0, i, options);
        return new int[]{options.outWidth, options.outHeight};
    }
}
