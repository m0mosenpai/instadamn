package com.facebook.imagepipeline.nativecode;

import X.C09270dc;
import android.graphics.Bitmap;

/* loaded from: classes11.dex */
public class NativeRoundingFilter {
    public static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i, int i2, int i3, int i4);

    public static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z);

    public static native void nativeToCircleFilter(Bitmap bitmap, boolean z);

    public static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i, int i2, boolean z);

    static {
        C09270dc.A01("native-filters");
    }

    public static void toCircle(Bitmap bitmap, boolean z) {
        bitmap.getClass();
        if (bitmap.getWidth() >= 3 && bitmap.getHeight() >= 3) {
            nativeToCircleFilter(bitmap, z);
        }
    }

    public static void toCircleFast(Bitmap bitmap, boolean z) {
        bitmap.getClass();
        if (bitmap.getWidth() >= 3 && bitmap.getHeight() >= 3) {
            nativeToCircleFastFilter(bitmap, z);
        }
    }
}
